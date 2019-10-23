package com.shrey.samples.java8;

public class WithLambda {
public static void main(String[] args) {
	MyInterface1 myInterface1= (var1,var2)-> (var1 + var2);
	int result1=myInterface1.addTwoNumbers(10, 20);
	System.out.println(result1);
	
	MyInterface1 myInterface2= (var1, var2)->{return(var1 + var2);};
	int result2=myInterface2.addTwoNumbers(40, 20);
	System.out.println(result2);
}
}
