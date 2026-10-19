package com.example.school.service;

import com.example.school.entity.Staff;

public interface StaffService {

	public void addStaff(Staff s);

	public Staff getStaffById(int id);

	public void deleteStaffById(int id);

	public void deleteAllStaff();

}
