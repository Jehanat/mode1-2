package com.hcl.interfaces;
interface ITraining{
	void name();
	void email();
}
class Hema implements ITraining{

	@Override
	public void name() {
		System.out.println("Name is Hema");
	
		
	}

	@Override
	public void email() {
		System.out.println("hema123@gmail.com");
		
		
	}
	
}
class Jehanat implements ITraining {

	@Override
	public void name() {
	System.out.println("Name is Jehanat");
		
	}

	@Override
	public void email() {
		System.out.println("jehanatjamil@gmail.com");
		
	}
	
}
public class IntfDemo {
	public static void main(String[] args) {
		ITraining[] arr =new ITraining[]
				{
						new Hema(),
						new Jehanat()
				};
		for(ITraining t:arr){
			t.name();
			t.email();
		}
		
	}
	

}
