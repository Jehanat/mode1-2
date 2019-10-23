package com.hcl.Quiz;
class Employ{
	String name;
	public Employ(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employ [name=" + name + "]";
	}
	
}
class HrEmploy extends Employ{

	public HrEmploy(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
class JavaEmploy extends Employ{

	public JavaEmploy(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
public class Quiz3 {
	public static void main(String[] args) {
		Employ[] arrEmploy=new Employ[]{
				new HrEmploy("Sagar"),
				new JavaEmploy("Niveditha"),
				new HrEmploy("Lakshmi"),
				new JavaEmploy("Gupta"),
				new HrEmploy("Aakash"),
				new JavaEmploy("Shafiq"),
				new HrEmploy("Sajid"),
				new JavaEmploy("Praveen"),
				new HrEmploy("Wahid"),
		};
		
		for(Employ employ:arrEmploy){
			if(employ instanceof JavaEmploy){
				System.out.println(employ);
			}
		}
	}
}

