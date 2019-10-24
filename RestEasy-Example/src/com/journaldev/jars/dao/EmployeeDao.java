package com.journaldev.jars.dao;

import java.util.List;
import java.util.Set;

import javax.ws.rs.core.Response;

import com.journaldev.jaxrs.model.Employee;


public interface EmployeeDao {
	

		public void addEmployee(Employee e);
		
		public void deleteEmployee(int id);
		
		public Employee getEmployee(int id);
		
		public List<Employee> getAllEmployees();

		

		

	}