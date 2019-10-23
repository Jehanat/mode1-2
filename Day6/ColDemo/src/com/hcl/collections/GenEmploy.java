package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {

	public static void main(String[] args) {
		List<Employ> lstEmploy=new ArrayList<Employ>();
		lstEmploy.add(new Employ(1,"Divya",8765));
		lstEmploy.add(new Employ(2,"Laksh",8432));
		lstEmploy.add(new Employ(3,"Vinod",8865));
		lstEmploy.add(new Employ(4,"Prem",8452));
		lstEmploy.add(new Employ(5,"Raghu",8965));
		lstEmploy.add(new Employ(6,"Hema",8032));
		System.out.println("Employ List ");
		lstEmploy.forEach(System.out::println);

		
	}
}
