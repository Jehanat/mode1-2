package com.hcl.employee.service;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hcl.employee.dao.EmployeeDaoImpl;
import com.hcl.employee.model.Employee;

@Path("/employee")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class EmployeeServiceImpl implements EmployeeService{

private static Map<Integer,Employee> emps = new HashMap<Integer,Employee>();
EmployeeDaoImpl employeeDAO=new EmployeeDaoImpl();


@GET
@Path("/getAll")
public Employee[] getAllEmployees() {
List<Employee> ids = employeeDAO.getAllEmployees();
Employee[] e = new Employee[ids.size()];
int i=0;
for(Employee id : ids){
e[i] = (Employee)employeeDAO.getAllEmployees();
i++;
}
return e;
}

}

