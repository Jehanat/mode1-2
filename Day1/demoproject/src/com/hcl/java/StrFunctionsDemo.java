package com.hcl.java;

public class StrFunctionsDemo {
	public static void main(String[] args) {
		String str="Welcome to Java Programming";
		System.out.println("Length of String"+str.length());
		System.out.println("char at 5th position"+str.charAt(5));
		System.out.println("Index of 'a' is"+str.indexOf('a'));
		System.out.println("Last occurrence of 'a'"+str.lastIndexOf('a'));
		System.out.println("Substring"+str.substring(3,9));
		String s1="Hello",s2="Hello";
		System.out.println(s1.equals(s2));
		String s3="Java",s4="Programming";
		System.out.println(s3.compareTo(s4));
		s3="Programming"; s4="Java";
		System.out.println(s3.compareTo(s4));
		s3="Java";
		s4="Programming";
		System.out.println(s3.compareTo(s4));
	}

}
