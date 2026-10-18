package com.example.school.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.school.entity.Teacher;
import com.example.school.repository.TeacherRepository;

public class TeacherServiceImpl implements TeacherService {

	@Autowired
	TeacherRepository teacherRepository;

	@Override
	public void addTeacher(Teacher t) {
		// TODO Auto-generated method stub
		teacherRepository.save(t);
	}

	@Override
	public Teacher getTeacherById(int id) {
		// TODO Auto-generated method stub
		return teacherRepository.findById(id).get();
	}

	@Override
	public void deleteTeacherById(int id) {
		// TODO Auto-generated method stub
		teacherRepository.deleteById(id);
	}

	@Override
	public void deleteAllTeacher() {
		// TODO Auto-generated method stub
		teacherRepository.deleteAll();
	}

}
