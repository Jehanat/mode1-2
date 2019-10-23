package com.hcl.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
	
		static List<Customer> lstCustomer=null;
		static{
			lstCustomer=new ArrayList<Customer>();
		}
		public String addCustomerDao(Customer customer){
		lstCustomer.add(customer);
		return "Customer created successfully..";
		}
		public Customer searchCustomerDao(int custId, Customer customer){
			Customer objCustomer=null;
			for(Customer student:lstCustomer){
				if(customer.getCustId()==custId ){
					objCustomer=customer;
				}
			}
			return objCustomer;
			
		}
		public List<Customer>showCustomerDao(){
			return  lstCustomer;
		}

		public String updateCustomerDao(Customer objCustomer){
			Customer customer=searchCustomerDao(objCustomer.getCustId());
			if(customer!=null){
				for(Customer s: lstCustomer){
			
					if(s.getCustId()==objCustomer.getCustId()){
						s.setCustName(objCustomer.getCustName());
						s.setAnnualPremium(objCustomer.getAnnualPremium());
						s.setModalPremium(objCustomer.getModalPremium());
						s.setPaymentMode(objCustomer.getPaymentMode());
					}
				}
				return "Record Updated...";
			}else{
				return "Customer no. not found!...";
					}
				}
			
		
			Customer searchCustomerDao(int custId) {
			// TODO Auto-generated method stub
			return null;
		}
			public String deleteCustomerDao(int custId){
				Customer customer=searchCustomerDao(custId);
				if(customer!=null){
					lstCustomer.remove(customer);
					return "Customer Removed";
				}else{
					return "Customer not found!";
				
				}
		}


public void writeStudentFileDao() {
	try {
		FileOutputStream fout=new FileOutputStream("c:/files/customer.txt");
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		objout.writeObject(lstCustomer);
		objout.close();
		fout.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void readStudentFileDao() {
	try {
		FileInputStream fin=new FileInputStream("c:/files/customer.txt");
		ObjectInputStream objin=new ObjectInputStream(fin);
		lstCustomer =(List<Customer>)objin.readObject();
		objin.close();
		fin.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void writeCustomerFileDao() {
	// TODO Auto-generated method stub
	
}
public void readCustomerFileDao() {
	// TODO Auto-generated method stub
	
}

}


