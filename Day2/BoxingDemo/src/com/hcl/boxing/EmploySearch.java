package com.hcl.boxing;

public class EmploySearch {
	public Employ showEmploy(int empno){
		Employ employ=null;
		
		if(empno==1){
			employ=new Employ();
			employ.empno=100;
			employ.name="Jenny";
			employ.basic=1234;
			
		}
		if(empno==2){
			employ=new Employ();
			employ.empno=102;
			employ.name="Shrey";
			employ.basic=4321;
			
		}
		return employ;
	}
	public static void main(String[] args) {
		EmploySearch objSearch=new EmploySearch();
		Employ res=objSearch.showEmploy(2);
		if(res!=null){
			System.out.println(res);}
		else{
			System.out.println("Employ not found");}
		}
		
	}
	


