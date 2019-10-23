package com.jenny;

import java.rmi.RemoteException;

import com.bindu.BinduProxy;
import com.jaanu.JananiDemoProxy;

public class MainApplication {

public static void main(String[] args) {
	int result1=0;
	int result2=0;
	int  resultadd=0;
	int resultmult=0;
	CalculatorProxy calculatorProxy= new CalculatorProxy();
	BinduProxy calculatorProxy1= new BinduProxy();
	JananiDemoProxy calculatorProxy2= new JananiDemoProxy();
	try {
		result1=calculatorProxy1.getInt();
		System.out.println(" SapCode of Bindu:" +result1);
		result2=calculatorProxy2.getInt();
		System.out.println(" SapCode of Janani:" +result2);

		resultadd=calculatorProxy.add(result1, result2);
		System.out.println("Addition of SapCode:" +resultadd);
		
		resultmult=calculatorProxy.mul(result1, result2);
		System.out.println("Multiplication of SapCode:" +resultmult);

	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}


