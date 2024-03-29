package com.batch2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public int getCustomerId() {

		return customerRepository.getCust_id();
	}
	public int getCust_idByLogin_id(int login_id) {
		return customerRepository.getCust_idByLogin_id(login_id);
	}
}
