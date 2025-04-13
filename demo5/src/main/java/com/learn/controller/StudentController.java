package com.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.entity.Student;
import com.learn.service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	private StudentService stdService;

	@PostMapping("/add-student")
	public String addData(@RequestBody Student student)
	{
		stdService.addStudent(student);
		return "Done";
	}
}
