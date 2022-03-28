package com.shorya.StudentManagementBoot.service;

import java.util.List;

import com.shorya.StudentManagementBoot.entity.Student;



public interface StudentService {
	public List<Student> findAll();
	
	public Student findById(int id);
	
	public void save(Student theStudent);
	
	public void deleteById(int id);

}