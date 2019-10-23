package com.hcl.jason;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

public class ReadJason {

 public static void main(String[] args) {
  BufferedReader objReader = null;
  String jsondata="";
  try {
   String strCurrentLine;

   objReader = new BufferedReader(new FileReader("C:\\Users\\Coalesce\\Downloads\\employee.json"));
  
   
//   {  
//////	  
//	    JSONObject jsonObject = (JSONObject)objReader;  
////        JSONObject jsonObject = (JSONObject) obj;  
//	    int empno=(Integer)jsonObject.get("empno");
//	    String name = (String) jsonObject.get("empname");  
//	    double salary = (Double) jsonObject.get("salary");  
//	    String band = (String) jsonObject.get("band"); 
//	    Date dateOfJoin=(Date)jsonObject.get("dateOfJoin");
//        
//	    System.out.println("Empno:" +empno);  
//	    System.out.println("Employee Name:" +empno);  
//	    System.out.println("Salary:" +salary);  
//	    System.out.println("Band:" +band);  
//	    System.out.println("dateOfJoin:" +dateOfJoin);  
//	    
//	}  
//	

   while ((strCurrentLine = objReader.readLine()) != null) {

    System.out.println(strCurrentLine);
   }

  } catch (IOException e) {

   e.printStackTrace();

  } finally {

   try {
    if (objReader != null)
     objReader.close();
   } catch (IOException ex) {
    ex.printStackTrace();
   }
  }
 }
}
