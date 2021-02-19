package com.danielk.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielk.departmentservice.entity.Department;
import com.danielk.departmentservice.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("inside saveDeaprtment method of DepartmentRepository");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("inside findDepartmentById method of DepartmentRepository");
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
