package com.hcl.ex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteStudent {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("c:/files/student.txt");
			ObjectOutputStream objout= new ObjectOutputStream(fout);
			Student e=new Student(1,"Jehanat","Delhi",8);
			objout.writeObject(e);
			objout.close();
			fout.close();
			System.out.println("Student Stored");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


