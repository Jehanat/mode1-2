package com.hcl.boxing;

public class ConTest {
	int a,b;

	public ConTest() {
		this.a=1;
		this.b=2;
		// TODO Auto-generated constructor stub
	}

	public ConTest(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "ConTest [a=" + a + ", b=" + b + "]";
	}
	public static void main(String[] args) {
		ConTest obj1=new ConTest();
		System.out.println(obj1);
		
		ConTest obj2=new ConTest(33,55);
		
		System.out.println(obj2);
	}

}
