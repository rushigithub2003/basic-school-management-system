package com.example.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.school.entity.Staff;
import com.example.school.service.StaffService;

@RestController
public class StaffController {

	@Autowired
	StaffService ss;

	@PostMapping("staff")
	String addStaff(@RequestBody Staff s) {
		ss.addStaff(s);
		return "Staff Added";
	}

	@GetMapping("staff/{id}")
	Staff getStaff(@PathVariable int id) {
		return ss.getStaffById(id);
	}

	@DeleteMapping("staff/{id}")
	String deleteStaffById(@PathVariable int id) {
		ss.deleteStaffById(id);
		return "Staff Deleted";
	}

	@DeleteMapping("staff")
	String deleteAllStaff() {
		ss.deleteAllStaff();
		return "All Staff Deleted";
	}

}
