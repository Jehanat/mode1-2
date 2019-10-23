package com.hcl.ex;

public class Div {
	public static void main(String[] args) {
		int a,b,c;
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("Division"+c);
		} catch (ArithmeticException e) {
			System.out.println("Division with zero is impossible");
		}
		catch(NumberFormatException e){
		System.out.println("String cannot be conv as Int");
		
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Arguments are mandatory");
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		finally{
			System.out.println("Program By HCL participants");
		}
		
	}

	}
