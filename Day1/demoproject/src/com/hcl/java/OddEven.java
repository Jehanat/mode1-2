package com.hcl.java;

public class OddEven {
	public void check(int n){
		if(n%2==0){
			System.out.println("Even number");}
		else{
			System.out.println("odd number");
		}
	}
public static void main(String[] args) {
	int n=10;
	OddEven obj=new OddEven();
	obj.check(n);
}
}
