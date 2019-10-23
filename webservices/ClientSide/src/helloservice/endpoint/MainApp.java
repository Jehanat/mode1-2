package helloservice.endpoint;

import java.rmi.RemoteException;


public class MainApp {

	public static void main(String[] args) {
		String result=null;
		HelloProxy proxy= new HelloProxy();
		
			try {
				result=proxy.sayHello("Mom & Dad");
				System.out.println(result);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	}
	
