package com.hcl.obj;

public class Employ {
int empno;
String name;
double basic;

public Employ[] showEmploy(){
	Employ[]arrEmploy=new Employ[3];
	arrEmploy[0]=new Employ();
	arrEmploy[0].empno=1;
	arrEmploy[0].name="Anu";
	arrEmploy[0].basic=5674;
	
arrEmploy[1]=new Employ();
arrEmploy[1].empno=2;
arrEmploy[1].name="Binny";
arrEmploy[1].basic=6543;
 arrEmploy[2]=new Employ();
arrEmploy[2].empno=3;
arrEmploy[2].name="Seema";
arrEmploy[2].basic=8974;
return arrEmploy;
}
public static void main(String[] args){
	Employ[] result=new Employ().showEmploy();
	for(Employ e: result){
		System.out.println(e.empno+" "+e.name+""+e.basic);
	}
}
}
