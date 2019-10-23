package com.hcl.project;

import java.util.List;

public class CustomerBAL {

static StringBuilder sb=new StringBuilder();
public void writeCustomerFileBal() {
	new CustomerDAO().writeCustomerFileDao();
}

public void readCustomerFileBal() {
	new CustomerDAO().readCustomerFileDao();
}
public boolean addCustomerBal(Customer objCustomer ) throws CustomerException{
	boolean isAdded=true;
	if(objCustomer.getCustId()<0){
		sb.append("Customer No cannot be Negative \r\n");
		isAdded=false;
	}
	if(objCustomer.getCustName().length()<=5){
		sb.append("Name More than five characters\r\n");
		isAdded=false;
	}
	if(objCustomer.getAnnualPremium()<= 20000 && objCustomer.getAnnualPremium()>=1000000){
		sb.append("Annual Premium should be between 20000 and 1000000\r\n");
	}
	if(objCustomer.getModalPremium()<=1000 && objCustomer.getModalPremium()>=50000){
		sb.append("Modal Premium should be between 1000 and 50000\r\n");
		isAdded=false;
	}
	if(objCustomer.getPaymentMode()<=0) {
		sb.append("Payment mode should be 1,2 and 3");
		isAdded=false;}
	if(objCustomer.getPaymentMode()>=4){
		sb.append("Payment mode should be 1,2 and 3 ");
	}
	if(isAdded==false){
		throw new CustomerException(sb.toString());
	}
	else{
		new CustomerDAO().addCustomerDao(objCustomer);
	}
	return isAdded;
	
			
	}
public Customer searchCustomerBal(int custId)
{
	return new CustomerDAO().searchCustomerDao(custId);
}
public List<Customer> showCustomerBal(){
	return new CustomerDAO().showCustomerDao();
	
}
public String updateCustomerBal(Customer objCustomer){
	return new CustomerDAO().updateCustomerDao(objCustomer);
}
public String deleteCustomerBal(int custId){
	return new CustomerDAO().deleteCustomerDao(custId);
	
}

public boolean addCustomerBAL(Customer objCustomer) {
	// TODO Auto-generated method stub
	return false;
}
	


	
}

