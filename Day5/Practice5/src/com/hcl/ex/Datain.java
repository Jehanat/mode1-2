package com.hcl.ex;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Datain {
	public static void main(String[] args) {
		try {
			DataInputStream din = new DataInputStream(new FileInputStream("c:/files/data.txt"));
		int x=din.readInt();
		x++;
		System.out.println("X value" +x);
		String name=din.readUTF();
		System.out.println("Name" +name);
		double bas=din.readDouble();
		System.out.println("Basic"+bas);
		boolean flag=din.readBoolean();
		System.out.println("flag"+flag);
		din.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
