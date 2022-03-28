package com.shorya.StudentManagementBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shorya.StudentManagementBoot.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
