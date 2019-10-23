package com.hcl.abs;
abstract class Animal{
	abstract void name();
	abstract void type();
}

class Tiger extends Animal{

	@Override
	void name() {
		System.out.println("Name is Tiger");
		
	}

	@Override
	void type() {
	System.out.println("Type is teresterial");
		
	}
	
	class Frog extends Animal{

		@Override
		void name() {
			System.out.println("Name is Frog");
			
		}

		@Override
		void type() {
			System.out.println("Type is amphibian");
			
		}
		
	}
	
}
public class AbsTest {
	public static void main(String[] args) {
        
		Animal[] arr=new Animal[]{
				new Tiger(),
				new Frog()};
		for(Animal animal:arr){
			animal.name();
			animal.type();
		}
	}
	

}


}
