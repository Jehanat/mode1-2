package com.javainterviewpoint;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SaveLogic 
{
    private static SaveLogic saveLogic;
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    public static void main( String[] args )
    {
        //Reading the Configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        
        //Get the SaveLogic bean
        saveLogic = (SaveLogic)context.getBean("saveLogic");
        
        saveLogic.saveEmployee();
        
        context.close();
    }
    
    public void saveEmployee()
    {
        Employee employee = new Employee();
        employee.setEmpName("Coco");
        
        Employee_Address employeeAddress1 = new Employee_Address();
        employeeAddress1.setStreet("NewYearColony");
        employeeAddress1.setCity("Eurasia");
        employeeAddress1.setCountry("Russia");
        employeeAddress1.setState("Moscow");
        employeeAddress1.setEmployee(employee);
        
//        
//        Employee_Address employeeAddress2 = new Employee_Address();
//        employeeAddress2.setStreet("Street1");
//        employeeAddress2.setCity("City1");
//        employeeAddress2.setCountry("Australia");
//        employeeAddress2.setState("Bcd");
//        employeeAddress2.setEmployee(employee);
//        
//        Employee_Address employeeAddress3 = new Employee_Address();
//        employeeAddress3.setStreet("Street1");
//        employeeAddress3.setCity("City1");
//        employeeAddress3.setCountry("NewZealand");
//        employeeAddress3.setState("Def");
//        employeeAddress3.setEmployee(employee);
//        
//        
//        
//        Employee_Address employeeAddress4 = new Employee_Address();
//        employeeAddress4.setStreet("Street1");
//        employeeAddress4.setCity("City1");
//        employeeAddress4.setCountry("NewZealand");
//        employeeAddress4.setState("Efg");
//        employeeAddress4.setEmployee(employee);
        
        
        Set<Employee_Address> employeeAddressSet = new HashSet<Employee_Address>();
        employeeAddressSet.add(employeeAddress1);
//        employeeAddressSet.add(employeeAddress2);
//        employeeAddressSet.add(employeeAddress3);
//        employeeAddressSet.add(employeeAddress4);
        
        
        employee.setEmployeeAddress(employeeAddressSet);
        
        
        employeeRepository.save(employee);
        System.out.println("Employee and Employee Address saved successfully!!");
    }
}
