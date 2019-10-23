package com.hcl.java;

public class Maxofthree {
	public void check(int a,int b,int c){
		if(a>b && a>c)
		{
			System.out.println("a is the greatest");
			
		}
		else if(b>a && b>c){
			System.out.println("b is the greatest");
		}
		else {
			System.out.println("c is the greatest");
		}
	}
public static void main(String[] args) {
	int a=1;int b = 2;int c=3;
	Maxofthree obj=new Maxofthree();
	obj.check(a,b,c);
}
}
