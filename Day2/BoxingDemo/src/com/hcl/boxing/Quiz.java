package com.hcl.boxing;

public class Quiz {
	public void show(Object x){
		System.out.println("Object"+x);
	}
	public void show(double x){
		System.out.println("Double"+x);
		
	}
public static void main(String[] args) {
	new Quiz().show(12);
}
}
