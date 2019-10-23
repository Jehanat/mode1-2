package com.hcl.project;

public class Student {
	private int sno;
	private String name;
	private String city;
	private double cgpa;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgpa=" + cgpa + "]";
	}
	

	}
	


