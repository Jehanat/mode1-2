package com.hcl.obj;

import com.hcl.java.SbExample;

public class Agent {
	public StringBuilder show(String agentId,String fullName,int maritalStatus,String zipcode){
		StringBuilder sbError=new StringBuilder();
		boolean isValid=true;
		if(agentId.charAt(0)!='A'){
			isValid=false;}
			if(fullName.indexOf(' ')== -1){
				sbError.append("Name Contains space"+"\r\n");
				isValid=false;
	}
if(fullName.length()>20){
	sbError.append("It has not more than 20 characters" + "\r\n");
	isValid=false;}

if(maritalStatus!=0 && maritalStatus !=1 ){
	sbError.append("marital status is 0 or 1" + "\r\n");
	isValid=false;}
if(zipcode.length()>6){
	sbError.append("Zipcode has 6 characters"+"r\n");
}

if(isValid==true){
	sbError.append("AgentId "+agentId +"\r\n");
	sbError.append("fullName "+fullName +"\r\n");
sbError.append("maritalStatus "+maritalStatus +"\r\n");
sbError.append("zipCode"+zipcode+"\r\n");
	} 
	return sbError;
	
}
public static void main(String[] args) {
	
	String agentId;
	String fullName;
	int maritalStatus;
	String zipCode;
	
	agentId="Amrita";
	fullName="Amrita Kumar";
	maritalStatus=1;
	zipCode="skplmst";
	
	StringBuilder sbRes=
			new Agent().show(agentId,fullName,maritalStatus,zipCode);
	new Agent().show(agentId,fullName,maritalStatus,zipCode);
	System.out.println(sbRes);
}
}

