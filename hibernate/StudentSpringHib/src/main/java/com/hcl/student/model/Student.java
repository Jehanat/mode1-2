package com.hcl.student.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Student")

public class Student implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;	 //rollNum int Primary key,
	 //sName varchar(20),
	// age int,
	// gender varchar(20),
	// country varchar(20),
	 //dateOfJoin date,
	 //finalScore float
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private int rollNum;
	@Column
	private String sName;
	@Column
	private int age;
	@Column
	private String gender;
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}