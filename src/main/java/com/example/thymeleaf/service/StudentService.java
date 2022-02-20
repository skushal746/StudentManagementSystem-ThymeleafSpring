package com.example.thymeleaf.service;

import java.util.List;

import com.example.thymeleaf.entity.Student;

public interface StudentService {
	List<Student> getAllStudentDetails();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudent(Long id);
}
