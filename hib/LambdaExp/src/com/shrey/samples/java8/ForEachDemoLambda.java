package com.shrey.samples.java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemoLambda {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
list.forEach((String var)-> System.out.println(var));
	}
}
