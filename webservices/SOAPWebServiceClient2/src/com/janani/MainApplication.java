package com.janani;

import java.rmi.RemoteException;



public class MainApplication {
	
		public static void main(String[] args) {
			String result;
			JananiProxy jananiProxy= new JananiProxy();
			
				try {
					result=jananiProxy.getName();
					System.out.println("Details of Janani:" +result);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		}
		