package com.hcl.boxing;

public class OverLoadDemo {
	public void show(int x){
		System.out.println("Show method w.r.t Int"+ x);
	}
public void show(String x){
	System.out.println("Show method w.r.t String"+x);
}
public void show(boolean x){
	System.out.println("Show method w.r.t Boolean"+x);
}
public void show(double x){
	System.out.println("Show method w.r.t Double"+x);}
public static void main(String[] args) {
	OverLoadDemo obj=new OverLoadDemo();
	obj.show(12);
	obj.show("Jenny");
	obj.show(false);
	obj.show(55.6);
}
}

