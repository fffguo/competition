package com.example.competition.utils;

import com.example.competition.enums.ErrorEnum;
import com.example.competition.exception.CompetitionException;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.UnavailableSecurityManagerException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.apache.shiro.util.ThreadContext;
import org.junit.After;

/**
 * shiro通用工具类
 * @作者：刘富国
 * @创建时间：2018/1/24 11:27
 */
@Slf4j
public class ShiroUtil {

    private static SecurityManager securityManager;
    private static final String shiroConfig="classpath:shiro/shiro-jdbc-realm";

    public ShiroUtil() {
    }

    /** 获取subject */
    public static Subject getSubject() {
        Subject subject = ThreadContext.getSubject();
        if (subject == null) {
            subject = (new Subject.Builder()).buildSubject();
            ThreadContext.bind(subject);
        }
        return subject;
    }

    /** 登录  */
    public static Subject login(String username,String password,boolean remeberMe){
        //1.获取securityManager工厂
        Factory<SecurityManager> factory=new IniSecurityManagerFactory(shiroConfig);
        //2.得到securityManager实例，并绑定给securityUtils
        SecurityManager securityManager=factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        //3.获取subject，使用用户名密码验证token
        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(username,password,remeberMe);
        try {
            subject.login(usernamePasswordToken);
        }catch (UnknownAccountException e){
            log.error("【登录】账号不存在，username={}",username);
            throw new CompetitionException(ErrorEnum.ACCOUNT_NOT_EXIST);
        }
        catch (AuthenticationException e){
            e.printStackTrace();
        }
        return subject;
    }

    /** 登录 */
    public static Subject login(String username,String password){
        return  login(username,password,false);
    }

    /** 设置 securityManager */
    public static void setSecurityManager(SecurityManager securityManager) {
        securityManager = securityManager;
    }

    /** 获取 securityManager */
    public static SecurityManager getSecurityManager() throws UnavailableSecurityManagerException {
        SecurityManager securityManager = ThreadContext.getSecurityManager();
        if (securityManager == null) {
            securityManager = securityManager;
        }
        if (securityManager == null) {
            String msg = "No SecurityManager accessible to the calling code, either bound to the " + ThreadContext.class.getName() + " or as a vm static singleton.  This is an invalid application " + "configuration.";
            throw new UnavailableSecurityManagerException(msg);
        } else {
            return securityManager;
        }
    }

    @After
    public void tearDown() throws Exception {
        ThreadContext.unbindSubject();//退出时请解除绑定Subject到线程 否则对下次测试造成影响
    }
}
