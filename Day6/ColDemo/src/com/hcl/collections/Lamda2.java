package com.hcl.collections;

@FunctionalInterface
interface IHello{
	void sayHello();}
	@FunctionalInterface
	interface ICalc{
		int calc(int a,int b);
	}

public class Lamda2 {
public static void main(String[] args) {
	IHello h1 = () ->{
		System.out.println("Hello from Shrey");
	};
	IHello h2 = () ->{
		System.out.println("Hello from Sharry");
	};
	IHello h3 = () ->{
		System.out.println("Hello from Jenny");
	};
	h1.sayHello();
	h2.sayHello();
	h3.sayHello();}
	ICalc ad1=(a,b)->{
		System.out.println("Sum");
		return a+b;
	};
	{
System.out.println(ad1.calc(12,5));

}}
