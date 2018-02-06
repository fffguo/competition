package com.example.competition.dao.repository;

import com.example.competition.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @作者：刘富国
 * @创建时间：2018/1/24 16:50
 */
public interface UserRepository extends JpaRepository<User,Integer>{
    /** 通过username和status 查询user信息 */
    User findByUsernameAndUserStatus(String username, Integer status);

    /** 通过id和status 查询user信息 */
    User findByUserIdAndUserStatus(Integer id, Integer status);

    /** 通过username 查询user信息 */
    User findByUsername(String username);

    User findByDetailId(Integer detailId);



}
