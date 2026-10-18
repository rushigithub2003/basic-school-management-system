package com.example.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.school.entity.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer> {

}
