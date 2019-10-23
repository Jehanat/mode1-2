package com.hcl.ex;

public class AssertDemo {
	public void incr(){
		int basic=30000;
		for(int i=0;i<8;i++){
			basic=basic+4000;
			assert basic<48000;
			System.out.println("Salary" +basic);
		}
	}
 public static void main(String[] args) {
	new AssertDemo().incr();
}
}
