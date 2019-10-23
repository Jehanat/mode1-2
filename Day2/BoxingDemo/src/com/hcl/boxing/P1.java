package com.hcl.boxing;

public class P1 {
	public void show(int x){
		switch(x)
		
		
		    case1:
			System.out.println("Hi 1");
		    break;
		    case2:
		    	System.out.println("Bye2");
		    break;
		    case3:
		    	System.out.println("Hello 3");
		    case4:
		    	System.out.println("Test 4");
		    case5:
		    	System.out.println("Demo 5");
		    default :
		    	System.out.println("Default Message");
		}
	}
	public static void main(String[] args) {
		P1 obj = new P1();
		obj.show(3);
	
	}

}
