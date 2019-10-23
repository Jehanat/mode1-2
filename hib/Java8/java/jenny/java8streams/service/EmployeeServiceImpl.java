package jenny.java8streams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import jenny.java8streams.dao.EmployeeDAO;
import jenny.java8streams.model.Employee;

@Service
@Transactional

public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Transactional
	public List<Employee> getAllEmployees() {
		 
				return employeeDAO.getAllEmployees();
			
	}

}
