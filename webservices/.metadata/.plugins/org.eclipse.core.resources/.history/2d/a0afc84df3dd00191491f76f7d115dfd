package com.journaldev.jaxrs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="Employee")
@XmlRootElement(name = "employee")
public class Employee {
	private String name;
	private double salary;
	private int id;
	@Id
	@Column(name="id")

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name="salary")

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

	@Override
	public String toString() {
		return id + "::" + name + "::" + salary;
	}

}
