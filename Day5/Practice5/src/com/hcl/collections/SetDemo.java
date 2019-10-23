package com.hcl.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
	Set s=new LinkedHashSet();
	s.add("Jenny");
	s.add("Shrey");
	s.add("Mona");
	s.add("Sharry");
	s.add("Jenny");
	s.add("Shrey");
	s.add("Mona");
	s.add("Sharry");
	s.add("Jenny");
	s.add("Shrey");
	s.add("Mona");
	s.add("Sharry");
	s.add("Jenny");
	s.add("Shrey");
	s.add("Mona");
	s.add("Sharry");
	System.out.println("LinkedHashset Data");
	s.forEach(System.out::println);
}

}
