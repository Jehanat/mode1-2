package com.jenny.java8streams.model;

import java.io.Serializable;
import java.sql.Date;


@Entity
@Table(name="Employee")

public class Employee implements Serializable {
//	empNo int(11) NOT NULL AUTO_INCREMENT,
//	primary key(empNo),
//	empName varchar(20),
//	salary float,
//	band varchar(20),
//	dateOfJoin Date
	private static final long serialVersionUID = -3465813074586302847L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empNo;
	
	@Column(name="empName")
	private String empName;
	
	@Column(name="salary")
    private float salary;
	
	@Column(name="band")
	private String band;
	
	@Column(name="dateOfJoin")
    private Date dateOfJoin;
	

	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public Date getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	
}
