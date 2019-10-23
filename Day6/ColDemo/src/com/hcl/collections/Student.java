package com.hcl.collections;

public class Student {
	String firstname;
	String lastName;
	String city;
	double cgpa;
	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", lastName=" + lastName + ", city=" + city + ", cgpa=" + cgpa + "]";
	}
	public Student(String firstname, String lastName, String city, double cgpa) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.city = city;
		this.cgpa = cgpa;
	}
	
	

}
