package com.example.school.service;

import com.example.school.entity.Teacher;

public interface TeacherService {

	public void addTeacher(Teacher t);

	public Teacher getTeacherById(int id);

	public void deleteTeacherById(int id);

	public void deleteAllTeacher();

}
