package com.hcl.jason.model;

public class Employee {
	 private long empno;
	 private String empname;
	 private long salary;
	 private String band;
	 private String dateOfJoin;
	public long getEmpno() {
		return empno;
	}
	
	public void setEmpno(long empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public String getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

@Override
public String toString() {
	return "Employee [empno=" + empno + ", empname=" + empname + ", salary=" + salary + ", band=" + band
			+ ", dateOfJoin=" + dateOfJoin + "]";
}}
