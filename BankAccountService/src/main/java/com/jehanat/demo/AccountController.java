package com.jehanat.demo;

import java.util.logging.Logger;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
//@RequestMapping("/account")
public class AccountController {

	
	



		protected Logger logger = Logger
				.getLogger(AccountController.class.getName());
		
		@Autowired
		AccountRepository accountRepository;
		
		@Autowired
		AccountService accountservice;
		
		@RequestMapping("/{userid}/get")
		public Account byuserid(@PathVariable("userid") int userid) {
			logger.info("bank-account-microservice byUserid() invoked: " + userid);
			Account account = accountRepository.findAccountByUserid(userid);
			logger.info("bank-account-microservice byUserid() found: " + account);
			return account;
		}
		
		@PostMapping("/add")
		public  String addAccount(@RequestBody Account account) {
			
			accountRepository.save(account);
			return "Account Created";}
			
			@DeleteMapping("/{accountnum}/delete")
			public String deleteAccount(@PathVariable("accountnum") int accountnum) {
				accountRepository.deleteById(accountnum);
				return "Deleted";}
			
			
			
			
			
@RequestMapping("/{accountnum}/getbyaccountnum")
public Account byaccountnum(@PathVariable("accountnum") int accountnum) {
	logger.info("bank-account-microservice byUserid() invoked: " + accountnum);
	Account account1 = accountRepository.findAccountByAccountnum(accountnum);
	logger.info("bank-account-microservice byUserid() found: " + account1);
	return account1;
}}
	



