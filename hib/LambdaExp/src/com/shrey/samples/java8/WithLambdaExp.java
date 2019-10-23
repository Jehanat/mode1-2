package com.shrey.samples.java8;

public class WithLambdaExp {
public static void main(String[] args) {
	MyFunctionalInterface myFunctionalInterface =() -> {System.out.println("Welcome Lambda");
	
};
	myFunctionalInterface.sayMessage();
}
}