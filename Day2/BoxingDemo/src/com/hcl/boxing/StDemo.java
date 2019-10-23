package com.hcl.boxing;

public class StDemo {
	void show(){
		System.out.println("From show method");
	}
	static void display(){
		System.out.println("From display method");
	}
	public static void main(String[] args) {
		StDemo.display();
		new StDemo().show();
	}

}
