package com.danielk.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielk.departmentservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

	Department findByDepartmentId(Long departmentId);
	
}
