package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add("Jenny");
		s.add("Shrey");
		s.add("Mona");
		s.add("Sharry");
		System.out.println("Sorted Data");
		s.forEach(System.out::println);
	}

}
