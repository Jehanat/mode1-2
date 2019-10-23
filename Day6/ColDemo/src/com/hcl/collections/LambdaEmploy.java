package com.hcl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaEmploy {
	public static void main(String[] args) {
		List<Employ> list=new ArrayList<Employ>();
		list.add(new Employ(1,"Jenny",25000));
		list.add(new Employ(2,"Shrey",300));
		list.add(new Employ(3,"Sharry",150));
	//Collections.sort(list,(p1,p2)-> {
	//	return p1.name.compareTo(p2.name);
	//});
	//for(Employ employ :list){
	//	System.out.println(employ);
	//}
	//Collections.sort(list,(p1,p2)->{
	//	return(int)(p1.basic-p2.basic);
		
	//});
	//System.out.println("Sort By basic");
	//list.stream().filter(p-> p.basic>=20000).forEach(x->{
	//	System.out.println(x);});
	//System.out.println("-------------");
	//	for(Employ employ :list){
	//		System.out.println(employ);
		list.stream().filter(p-> p.basic>=20000).forEach(x->{
				System.out.println(x);});
	}
	}


