package com.hcl.interfaces;
interface IOne{
	void name();
}
interface ITwo{
	void email();
	
}
class Test implements IOne,ITwo{

	@Override
	public void email() {
		System.out.println("jehanatjamil@gmail.com");
		
	}

	@Override
	public void name() {
	System.out.println("Jehanat");
		
	}
	
}

public class MultiInh {
public static void main(String[] args) {
	Test obj=new Test();
	obj.name();
	obj.email();
	
}
}
