package com.hcl.show;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("jdbc.xml");
		EmployShowDao d=(EmployShowDao)ctx.getBean("myDao");
		d.showEmploy();
		System.out.println("Record of Employees");
}}

