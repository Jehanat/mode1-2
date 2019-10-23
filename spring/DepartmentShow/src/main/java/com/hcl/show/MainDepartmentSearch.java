package com.hcl.show;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDepartmentSearch {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("jdbc.xml");
		DepartmentShowDao d=(DepartmentShowDao)ctx.getBean("myDao");
		d.searchDepartment(2);

}}


