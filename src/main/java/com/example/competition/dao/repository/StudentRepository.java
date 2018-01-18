package com.example.competition.dao.repository;

import com.example.competition.dao.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 12:38
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {

    Page<Student> findByStudentStatus(Pageable pageable, Integer status);

    Student findOne(Integer studentId);
}
