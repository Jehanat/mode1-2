package com.hcl.ex;

public class ArrEx {
	
public static void main(String[] args) {
	int[] a=new int[]{12,5,3};
		try {
			a[6]=5/0;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size is small");
		}
		catch(ArithmeticException e){
			System.out.println("Division by zero is impossible");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
}
