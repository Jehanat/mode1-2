package com.hcl.ex;
class C1{
	int a,b;
	public C1(){
		a=5;
		b=8;
	}
	@Override
	public String toString() {
		return "C1 [a=" + a + ", b=" + b + "]";
	}
	
	
}
class C2 extends C1{
	public C2(int a,int b){
}}
public class P5 {
	public static void main(String[] args) {
		C2 obj=new C2(12,5);
		System.out.println(obj);
	}
}

