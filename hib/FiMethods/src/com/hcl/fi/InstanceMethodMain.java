package com.hcl.fi;

public class InstanceMethodMain {
	public static void main(String[] args) {
		
	
	InstanceInterface instanceInterface=()->{System.out.println("Jenny");};
	instanceInterface.myInterface();
	InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
	InstanceInterface in=instanceMethodReference::saySomething;
	in.myInterface();


}
}