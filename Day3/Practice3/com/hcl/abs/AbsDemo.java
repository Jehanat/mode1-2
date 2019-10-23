package com.hcl.abs;
abstract class Training{
	abstract void name();
	abstract void email();
}
class Anubhav extends Training{

	@Override
	void name() {
		System.out.println("Name is Anubhav");

		
	}

	@Override
	void email() {
		System.out.println("Anubhav@gmail.com");
		
	}
	
}

class Sai extends Training{

	@Override
	void name() {
	System.out.println("Name is Sai");
		
	}

	@Override
	void email() {
		System.out.println("sai123@gmail.com");
	}
	
}

public class AbsDemo {
	public static void main(String[] args) {
		Training t1=new Anubhav();
		Training t2=new Sai();
		
		Training[] arr=new Training[]{
				new Anubhav(),
				new Sai()};
		for(Training t:arr){
			t.name();
			t.email();
		}
	}
	

}
