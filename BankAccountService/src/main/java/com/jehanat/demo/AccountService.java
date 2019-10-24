package com.jehanat.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class AccountService {
	@Autowired
	public AccountRepository accountrepository;
	public Account findAccountByUserid(int userid) {
		Account account=accountrepository.findAccountByUserid(userid);
		return account;
	}
//	public String addAccount(Account account){
//		account =accountrepository.save(account);
//		if(account!=null){
//			return "Account created successfully";
//			
//		}else
//		{
//			return "Error Found";
//		}
		
		

	}
