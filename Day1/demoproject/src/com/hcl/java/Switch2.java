package com.hcl.java;

public class Switch2 {
	public void check(String opt){
		switch(opt.toUpperCase()){
		case "INSERT" :
			System.out.println("Insert Operation");
			break;
		case "UPDATE" :
			System.out.println("Update Operation");
			break;
		case "DELETE" :
			System.out.println(" Delete Operation");
			break;
		default:
			System.out.println("Invalid Operation");
			break;
		}
	}
public static void main(String[] args) {
	String op="InSeRT";
	new Switch2().check(op);
}
}
