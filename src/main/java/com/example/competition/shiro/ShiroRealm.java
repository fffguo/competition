package com.example.competition.shiro;

import com.example.competition.dao.dto.UserRoleDTO;
import com.example.competition.dao.mapper.PermissionMapper;
import com.example.competition.dao.mapper.UserMapper;
import com.example.competition.dao.model.Permission;
import com.example.competition.dao.model.Role;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cdyoue on 2016/10/21.
 */
@Slf4j
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PermissionMapper permissionMapper;

    /** 授权访问控制 */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        log.info("doGetAuthorizationInfo:"+principalCollection.toString());
        Map<String,Object> map=new HashMap<>();
        map.put("username",principalCollection.getPrimaryPrincipal());
        UserRoleDTO userRoleDTO = userMapper.selectUserAndRole(map);
        //把principals放session中 key=userId value=principals
        SecurityUtils.getSubject().getSession().setAttribute(String.valueOf(userRoleDTO.getUserId()),SecurityUtils.getSubject().getPrincipals());
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //赋予角色
        for(Role userRole:userRoleDTO.getRoles()){
            simpleAuthorizationInfo.addRole(userRole.getRoleName());
        }
        //赋予权限
        for(Permission permission:permissionMapper.selectPermissionByUserId(userRoleDTO.getUserId())){
//            if(StringUtils.isNotBlank(permission.getPermCode()))
            simpleAuthorizationInfo.addStringPermission(permission.getpName());
        }
        //设置登录次数、时间
//        userService.updateUserLogin(user);
        return simpleAuthorizationInfo;
    }

    /** 验证用户身份 */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        log.info("doGetAuthenticationInfo:"  + authenticationToken.toString());
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String userName=token.getUsername();
        log.info(userName+token.getPassword());
        Map<String,Object> map=new HashMap<>();
        map.put("username",token.getUsername());
        UserRoleDTO userRoleDTO = userMapper.selectUserAndRole(map);
        if (userRoleDTO != null) {
//            byte[] salt = Encodes.decodeHex(user.getSalt());
//            ShiroUser shiroUser=new ShiroUser(user.getId(), user.getLoginName(), user.getName());
            //设置用户session
            SecurityUtils.getSubject().getSession().setAttribute("user", userRoleDTO);
            return new SimpleAuthenticationInfo(userName,userRoleDTO.getPassword(),getName());
        } else {
            return null;
        }
//        return null;
    }

}
