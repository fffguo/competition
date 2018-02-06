package com.example.competition.dao.repository;

import com.example.competition.dao.entity.User_role_rel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @作者：刘富国
 * @创建时间：2018/2/6 16:51
 */
public interface User_role_relRepository extends JpaRepository<User_role_rel,Integer> {

    User_role_rel findByUserIdAndRoleId(Integer userId,Integer roleId);
}
