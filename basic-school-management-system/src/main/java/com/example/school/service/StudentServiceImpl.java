package com.example.school.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.school.entity.Student;
import com.example.school.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository sr;

	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		sr.save(s);
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return sr.findById(id).get();
	}

	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
	}

	@Override
	public void deleteAllStudent() {
		// TODO Auto-generated method stub
		sr.deleteAll();
	}

}
