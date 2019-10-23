package com.hcl.java;

public class CtoK {
	public void calc(double c){
		double k;
		k=c+273;
		System.out.println("Kelvin value" +k);
		
	}
	public static void main(String[] args) {
		double c=37;
		CtoK obj=new CtoK();
		obj.calc(c);
	}

}
