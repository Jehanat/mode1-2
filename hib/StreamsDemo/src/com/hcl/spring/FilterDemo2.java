package com.hcl.spring;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo2 {

public static void main(String[] args) {
	List<Employee>list=new ArrayList<Employee>();
	list.add(new Employee(10,"Apple",1010f,'E'));
	list.add(new Employee(20,"Banana",2010f,'M'));
	list.add(new Employee(30,"Carrot",3010f,'M'));
	list.add(new Employee(40,"Dates",4010f,'C'));
	list.add(new Employee(50,"Apricot",5010f,'M'));
	list.stream().filter((emp)->emp.getBand()=='M').forEach((arg)-> {System.out.println(arg.getBand());});
}
}
