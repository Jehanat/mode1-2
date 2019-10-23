package com.jenny;

import java.rmi.RemoteException;

public class MainApplication {
public static void main(String[] args) {
	int result=0;
	CalculatorProxy calculatorProxy= new CalculatorProxy();
	try {
		result=calculatorProxy.mul(2, 4);
		System.out.println("Multiplication of two numbers:" +result);
		result=calculatorProxy.add(8, 14);
		System.out.println("Addition of two numbers:" +result);

	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
