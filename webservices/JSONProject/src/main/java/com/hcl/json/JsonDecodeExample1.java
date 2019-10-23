package com.hcl.json;

import org.json.simple.JSONObject;  
import org.json.simple.JSONValue;  
public class JsonDecodeExample1 {  
public static void main(String[] args) {  
    String s="{\"name\":\"Shresth\",\"salary\":80000.0,\"age\":23}";  
    JSONObject jsonObject = (JSONObject)JSONValue.parse(s);  
//    JSONObject jsonObject = (JSONObject) obj;  
  
    String name = (String) jsonObject.get("name");  
    double salary = (Double) jsonObject.get("salary");  
    long age = (Long) jsonObject.get("age");  
    System.out.println(name+" "+salary+" "+age);  
}  
}  