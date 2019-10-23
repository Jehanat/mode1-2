package com.hcl.inheritance;

class C1 {
	public void show(){
		System.out.println("from show method");
	}

}
class C2 extends C1{
	public void display()
	{
		System.out.println("From display method");
	}
}
public class InhDemo
{
	public static void main(String[] args){
		C2 obj=new C2();
		obj.show();
		obj.display();
	}
}