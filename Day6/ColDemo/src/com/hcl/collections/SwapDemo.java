package com.hcl.collections;

 class Data<T> {

	public void swap(T x,T y) {
		
		T t;
		t=x;
		x=y;
		y=t;
		System.out.println("x value "  +x+  " Y value "  +y);
	}
	
}
 public class SwapDemo{
	 public static void main(String[] args) {
		Data obj=new Data();
		int x,y;
		x=12;
		y=13;
		obj.swap(x, y);
		double b1=12.5,b2=77.34;
		obj.swap(b1, b2);
		String s1="Hello",s2="World";
		obj.swap(s1, s2);
		boolean f1=true,f2=false;
		obj.swap(f1, f2);
	}
 }
