package com.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
