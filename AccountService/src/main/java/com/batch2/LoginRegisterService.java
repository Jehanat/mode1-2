package com.batch2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginRegisterService {

	@Autowired
	private LoginRegisterRepository loginRegisterRepository;
	String username;
	
	String authentication(String username, String password) {
		this.username=username;
		return loginRegisterRepository.authentication(username, password);
	}

	public int save(Login login) {
		// System.out.println("WebClient : LoginRegisterService..Registration");
		Login result = loginRegisterRepository.save(login);
		if(result.getUsername().equals(login.getUsername())) {
			return result.getLogin_id();
		} else {
			return -1;
		}
	}
	/*
	 * public String update(int cust_id){ return
	 * loginRegisterRepository.updateCust_id(cust_id, this.username);
	 * 
	 * }
	 */
	
}
