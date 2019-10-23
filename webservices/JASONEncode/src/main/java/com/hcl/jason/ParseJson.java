package com.hcl.jason;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.hcl.jason.model.Employee;

public class ParseJson {

@SuppressWarnings("unchecked")
public static void main(String[] args) throws IOException {

StringBuilder contentBuilder = new StringBuilder();
  
   try (Stream<String> stream= Files.lines( Paths.get("C:\\Users\\Coalesce\\Downloads\\employee.json"), StandardCharsets.UTF_8))
   {
       stream.forEach(s -> contentBuilder.append(s));
   }
   catch (IOException e)
   {
       e.printStackTrace();
   }
   String s= contentBuilder.toString();
   Object obj=JSONValue.parse(s);
   
   JSONObject jsonObject = (JSONObject) obj;  
   JSONObject jsonobj=(JSONObject) jsonObject.get("employees");
   JSONArray array=(JSONArray) jsonobj.get("employee");
   ArrayList<Employee>  lst= new ArrayList();
   for(int i=0;i<array.size();i++){
	   Employee emp=new Employee();
    JSONObject object=(JSONObject) array.get(i);
    long empno = (long) object.get("empno");  
    emp.setEmpno(empno);

    String empname = (String) object.get("empname");  
    emp.setEmpname(empname);
   long salary = (long) object.get("salary");
   emp.setSalary(salary);
   String band = (String) object.get("band");
   emp.setBand(band);
   String dateOfJoin = (String) object.get("dateOfJoin");  
   emp.setDateOfJoin(dateOfJoin);
   
   
   System.out.println(empno+" "+empname+" "+salary+" "+band+" "+dateOfJoin);  
   lst.add(emp);
   }  
   lst.forEach((var)-> System.out.println(var));
}  
}

