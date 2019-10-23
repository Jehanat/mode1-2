package com.hcl.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapGenDemo {
	public static void main(String[] args) {
		Map<Integer,String> m=new Hashtable<Integer,String>();
		m.put(1,"Darshni");
		m.put(2, "Laksh");
		m.put(3, "HCL");
		m.put(4,"Lakshmi");
		int key;
		String result;
		System.out.println("Enter key ");
		Scanner sc=new Scanner(System.in);
		key=sc.nextInt();
		result=m.getOrDefault(key, "Not Found..");
		System.out.println(result);
		
		
	}

}
