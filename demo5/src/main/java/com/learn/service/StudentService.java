package com.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.entity.Student;
import com.learn.repository.StudentRepository;

@Service
public class StudentService 
{
	@Autowired
	private StudentRepository stdRepo;

	
	public Student addStudent(Student student)
	{
		return stdRepo.save(student);
	}
}
