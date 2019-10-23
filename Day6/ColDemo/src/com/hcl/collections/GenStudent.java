package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class GenStudent {
	public static void main(String[] args) {
		List<Student> lstStudent=new ArrayList<Student>();
		lstStudent.add(new Student("Jehanat","Jamil","Delhi",9));
		lstStudent.add(new Student("Shrestha","Shourya","Gurgaon",10));
		lstStudent.add(new Student("Sharmeen","Hassan","Delhi",9));
		lstStudent.add(new Student("Prem","Ratan","Jaipur",8));
		
		System.out.println("Student List ");
		lstStudent.forEach(System.out::println);

		
	}
}


