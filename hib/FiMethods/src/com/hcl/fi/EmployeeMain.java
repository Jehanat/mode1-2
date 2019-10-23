package com.hcl.fi;

public class EmployeeMain {
public static void main(String[] args) {
	EmployeeInterface employeeInterface=Employee::new;
	Employee employee1=employeeInterface.employee(20,"HCL");
	System.out.println(employee1.getEmpNo());
	System.out.println(employee1.getEmpName());
	FunctionalInterface1 employeeInterface1=Employee::new;
	Employee employee2=employeeInterface1.employee(20);
	FunctionalInterface2 employeeInterface2=Employee::new;
	Employee employee3=employeeInterface2.employee("HCL");
	
	System.out.println(employee2.getEmpNo());
	System.out.println(employee3.getEmpName());
}
}
