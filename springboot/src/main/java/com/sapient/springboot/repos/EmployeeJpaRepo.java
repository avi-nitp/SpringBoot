package com.sapient.springboot.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.springboot.entities.Employee;

public interface EmployeeJpaRepo extends JpaRepository<Employee, Integer>{
	
	public Employee findEmployeeByName(String name);

}