package com.hcl.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadStudent {
	public static void main(String[] args) {
	try {
		FileInputStream fin = new FileInputStream("c:/files/student.txt");
		ObjectInputStream objin=  new ObjectInputStream(fin);
		Student e=(Student)objin.readObject();
		System.out.println(e);
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	
	}
}

}



