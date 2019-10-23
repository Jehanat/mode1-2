package com.hcl.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put("Priya","Darshni");
		m.put("Laksh", "Laksh");
		m.put("Rishab", "HCL");
		m.put("Kirumba","Lakshmi");
		
		String key="Priya";
		String value=(String)m.getOrDefault(key, "Not Found");
		System.out.println(value);
			
	}

}
