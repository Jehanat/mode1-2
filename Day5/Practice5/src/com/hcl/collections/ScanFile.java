package com.hcl.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScanFile {
public static void main(String[] args) {
	
	try {
		FileInputStream fin = new FileInputStream("C:/hcljava/Day5/Practice5/src/com/hcl/collections/ScanFile.java");
		Scanner sc=new Scanner(fin);
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		sc.close();
		fin.close();
	}catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
	
}
}
