package com.hcl.java;

public class Factnew {
public void calc(int n)
{
	int f=1;
	for(int i=n;i>1;i--){
		f=f*i;
		
	}
	System.out.println("Factorial value"+f);
	
}
public static void main(String[] args) {
	int n=8;
	new Factnew().calc(n);
}
}
