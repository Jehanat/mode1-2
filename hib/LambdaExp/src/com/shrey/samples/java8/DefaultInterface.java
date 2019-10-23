package com.shrey.samples.java8;

public interface DefaultInterface {
default void printHello(){
	
	System.out.println("Hello Default");
}
static void seeMessage(){
	System.out.println("Hi Jenny");
}
}
