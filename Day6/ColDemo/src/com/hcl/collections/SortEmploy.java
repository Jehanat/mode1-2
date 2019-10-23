package com.hcl.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator<Employ> c=new NameComparator();
		Set<Employ> setEmploy=new TreeSet<Employ>(c);
		setEmploy.add(new Employ(1,"Divya",8765));
		setEmploy.add(new Employ(2,"Laksh",8432));
		setEmploy.add(new Employ(3,"Vinod",8865));
		setEmploy.add(new Employ(4,"Prem",8452));
		setEmploy.add(new Employ(5,"Raghu",8965));
		setEmploy.add(new Employ(6,"Hema",8032));
		System.out.println("Employ List ");
		setEmploy.forEach(System.out::println);
	}

}
