package com.example.school.service;

import com.example.school.entity.Student;

public interface StudentService {

	public void addStudent(Student s);

	public Student getStudentById(int id);

	public void deleteStudentById(int id);

	public void deleteAllStudent();

}
