package com.hcl.inheritance;


	class C6 {
		public int a=3;
		private int b=8;
		protected int c=9;
		int d=2;
		
		 public void demo(){
			 System.out.println("Public inside"+a);
			 System.out.println("Private inside"+b);
			 System.out.println("Protected inside"+c);
			 System.out.println("Default inside"+d);
		 }
	 }
	 class C7 extends C6 {
		 public int a=3;
		 private int b=8;
		 protected int c=9;
		 int d=2;
		 
		 public void show(){
			 System.out.println("Public derived"+a);
			 System.out.println("Private derived"+b);
			 System.out.println("Protected derived"+c);
			 System.out.println("Default derived"+d);}}
	 class C8{
		 public void demo2(){
			 System.out.println("Public");
		 }
	 }
		
		 
		 
	
	



