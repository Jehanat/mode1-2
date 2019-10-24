package com.batch2;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/user")
public class LoginController {
	
	@Autowired
	private LoginRegisterService loginRegisterService;
	
	private static final Logger logger = Logger.getLogger(LoginController.class);
	  
	  @RequestMapping("/validateRegistrationForm/{username}/{password}") 
	  public ResponseEntity<Integer> validateRegistrationForm(@PathVariable("username")String username,@PathVariable("password") String password) {
		  logger.info("Setting the "+ username+ "and " + password);
		  Login login = new Login();
		  ModelAndView mv = new ModelAndView();
		  login.setUsername(username);
		  login.setPassword(password);
		  logger.info("LoginController : Registration ....."+login.getUsername()+"/"+login.getPassword());
			 
			int login_id  = loginRegisterService.save(login);
			 if(login_id==-1) {
				 return new ResponseEntity<Integer>(login_id,HttpStatus.BAD_REQUEST);
			 } else {
				 return new ResponseEntity<Integer>(login_id,HttpStatus.OK);
			 }
			
		  
	  }
	 
	  @RequestMapping(value="/authenticate/{username}/{password}")
	  public ResponseEntity<String> authenticateUser(@PathVariable("username")String username,@PathVariable("password") String password ) {
		  logger.info("Authentication in LoginController : " + username + " : " +password);
		  ModelAndView mv = new ModelAndView();
		  logger.info("Authenticating Username and Password");
		  String name = (String)loginRegisterService.authentication(username, password);
		  if(username.equals(name)) {
		 return new ResponseEntity<String>(name,HttpStatus.OK);}
		  else {
			 return new ResponseEntity<String>("Username or Password invalid",HttpStatus.BAD_REQUEST);} 
		 }
}
