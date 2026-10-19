package com.example.school.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.school.entity.Staff;
import com.example.school.repository.StaffRepository;

public class StaffServiceImpl implements StaffService {

	@Autowired
	StaffRepository sr;

	@Override
	public void addStaff(Staff s) {
		// TODO Auto-generated method stub
		sr.save(s);
	}

	@Override
	public Staff getStaffById(int id) {
		// TODO Auto-generated method stub
		return sr.findById(id).get();
	}

	@Override
	public void deleteStaffById(int id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
	}

	@Override
	public void deleteAllStaff() {
		// TODO Auto-generated method stub
		sr.deleteAll();
	}

}
