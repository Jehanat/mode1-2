package com.javainterviewpoint;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Component
public class RetrieveLogic
{
    private static RetrieveLogic retrieveLogic;

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args)
    {
        // Reading the Configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");

        // Get the RetrieveLogic bean
        retrieveLogic = (RetrieveLogic) context.getBean("retrieveLogic");

        retrieveLogic.retrieveEmployee();

        context.close();
    }
    public void retrieveEmployee()
    {
        // Get list of all Employee & Employee Address
       // List<Employee> employeeList = employeeRepository.findByCountry("Australia");
    	List<Employee> employeeList = employeeRepository.findByState("Moscow");
//    	List<Employee> employeeList = employeeRepository.findAll(Sort.by(Sort.Direction.ASC, "state"));

        // Displaying the Employee details
        for (Employee employee : employeeList)
        {
            System.out.println("*** Employee Details ***");

            System.out.println("Employee Id   : " + employee.getEmpId());
            System.out.println("Employee Name : " + employee.getEmpName());

            System.out.println("*** Employee Address Details ***");
            Set<Employee_Address> empAddressSet = employee.getEmployeeAddress();
            for (Employee_Address employeeAddress : empAddressSet)
            {
                System.out.println("Street  : " + employeeAddress.getStreet());
                System.out.println("City    : " + employeeAddress.getCity());
                System.out.println("State   : " + employeeAddress.getState());
                System.out.println("Country : " + employeeAddress.getCountry());
            }
//            List<Employee> emplist =employeeRepository.findEmpByCountry("US");
//            for(Employee employee1 : emplist)
//            {
//            	System.out.println(emplist);
//            }
        }
    }
}
