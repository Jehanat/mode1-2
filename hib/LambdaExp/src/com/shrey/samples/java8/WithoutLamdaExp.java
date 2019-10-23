package com.shrey.samples.java8;

public class WithoutLamdaExp {
public static void main(String[] args) {
	MyInterface myInterface=new MyInterface(){
		@Override
		public void sayMessage(){
			System.out.println("Welcome to my Interface");
		}
	
	@Override
	public void seeMessage(){
		System.out.println("Welcome to my Lambda");
	}
};
	myInterface.sayMessage();
	myInterface.seeMessage();
}
}
