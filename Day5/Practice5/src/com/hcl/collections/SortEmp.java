package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmp {
	
		public static void main(String[] args) {
			SortedSet s=new TreeSet();
			s.add(new Emp(1,"Jenny",67854));
			s.add(new Emp(2,"Shrey",78657));
			s.add(new Emp(3,"Mona",78654));
			s.add(new Emp(4,"Sharry",89765));
			System.out.println("Sorted Data");
			s.forEach(System.out::println);
		}	
}

