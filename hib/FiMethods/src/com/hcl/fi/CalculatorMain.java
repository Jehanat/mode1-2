package com.hcl.fi;

public class CalculatorMain {
public static void main(String[] args) {
	Calculator calculator=new Calculator();
	Integer ans =calculator.calc((x,y)-> x*y,19,1);
	System.out.println(ans);
}
}
