package com.example.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.school.entity.Teacher;
import com.example.school.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	TeacherService ts;

	@PostMapping("teacher")
	String addTeacher(@RequestBody Teacher t) {
		ts.addTeacher(t);
		return "Teacher added";
	}

	@GetMapping("teacher/{id}")
	Teacher getTeacherById(@PathVariable int id) {
		return ts.getTeacherById(id);
	}

	@DeleteMapping("teacher/{id}")
	String deleteTeacherById(@PathVariable int id) {

		ts.deleteTeacherById(id);
		return "Teacher Deleted";
	}

	@DeleteMapping("teacher")
	String deleteAllTeacher() {
		ts.deleteAllTeacher();
		return "All Teacher Deleted";
	}
}
