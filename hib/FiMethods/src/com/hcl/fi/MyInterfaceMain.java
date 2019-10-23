package com.hcl.fi;

import java.util.function.Consumer;

public class MyInterfaceMain {
public static void main(String[] args) {
	MyInterface myInterface=(a)->{System.out.println(a);};
	myInterface.someMethod("HCL");
	MyInterface myInterface1=System.out:: println;
	myInterface.someMethod("Java CoE");
	Consumer<String> consumer=System.out::println;
	consumer.accept("Bye");
}
}
