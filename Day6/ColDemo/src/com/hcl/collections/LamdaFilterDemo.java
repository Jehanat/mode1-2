package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class LamdaFilterDemo {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"Samsung A5",25000));
		list.add(new Product(2,"Iphone 6s",65000));
		list.add(new Product(3,"Sony Xperia",25150));
		list.add(new Product(1,"Nokia Lumia",25000));
		list.add(new Product(2," Iphone xs",90000));
		list.add(new Product(3,"Lenovo Vibe",19150));
		System.out.println("Phones greater than 20K");
		list.stream().filter(p-> p.price>=20000).forEach(x->{
			System.out.println(x);
		});
		System.out.println("Names start with S: ");
		list.stream().filter(p-> p.name.startsWith("S")).forEach(x->{
			System.out.println(x);
		});
		
		Product maxP =list.stream().max((p1,p2)-> p1.price>=p2.price?1:-1).get();
		System.out.println("Max Price Record");
		System.out.println(maxP);
		
		Product minP=list.stream().min((p1,p2) -> p1.price>=p2.price?1:-1).get();
		System.out.println("Min Price Record");
		System.out.println(minP);
	}

}
