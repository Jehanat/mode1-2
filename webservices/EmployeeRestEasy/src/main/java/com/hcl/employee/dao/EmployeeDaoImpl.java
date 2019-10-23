 package com.hcl.employee.dao;

import java.util.List;

import javax.ws.rs.core.Response;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.employee.model.Employee;




public class EmployeeDaoImpl implements EmployeeDao {


private SessionFactory sessionFactory;


@Override
public   List<Employee> getAllEmployees() {
	return sessionFactory.getCurrentSession().createQuery("from Employee")
			.list();
}

}




