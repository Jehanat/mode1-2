package com.batch2;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WebClientController {

	@Autowired
	LoginRegisterService loginRegisterService;
	
	@Autowired
	AddressService addressService;
	@Autowired
	CustomerService customerService;
	int result;
	
	private static final Logger logger = Logger.getLogger(WebClientController.class);
	
	 @RequestMapping("/") public ModelAndView displayLoginPage() {
		  logger.info("display login page");
		  ModelAndView mv = new ModelAndView();
		  mv.addObject("error"," ");
		  logger.error("Error in login");
		  mv.setViewName("login");
		  return mv;
	  }
	 
	 @RequestMapping("/home") public ModelAndView displayHomePage() {
		  ModelAndView mv = new ModelAndView();
		  mv.setViewName("home");
		  logger.info("Login into home page");
		  return mv;
	  }
	 
	 @RequestMapping("/martgageCalc") 
	 public ModelAndView displayMortgageCalcPage() {
		  logger.info("display login page");
		  ModelAndView mv = new ModelAndView();
		  mv.setViewName("mortgageCalc");
		  return mv;
	  }
	 
	 @RequestMapping("/loan") public ModelAndView displayLoanPage() {
		  logger.info("display loan page");
		  ModelAndView mv = new ModelAndView();
		  mv.setViewName("loan");
		  return mv;
	  }
	 
	 @RequestMapping("/register") 
	 public ModelAndView displayRegisterForm() {
		  ModelAndView mv = new ModelAndView();
		  mv.addObject("error","Password and Confirm Password Should Be Same");
		  logger.error("Password and Confirm Password Should Be Same");
		  mv.setViewName("register");
		  return mv;
	  }
	 
	 @RequestMapping("/validateRegistrationForm") 
	  public ModelAndView validateRegistrationForm(String username, String password,String confirmPassword) {
		  ModelAndView mv = new ModelAndView();
          logger.info("WebClient :Controller :  Registration ....."+username+"/"+password);
		  if(password.equals(confirmPassword)) {
			
			  result = loginRegisterService.save(username,password); 
			  
			  if(result != -1) {
				  logger.info("registration is successfull then go to SetProfile page");
				  mv.addObject("login_id",result);
				  mv.setViewName("setProfile");
			  }
			  
			  else {
				  logger.info("username already exist");
				  mv.addObject("error",result);
				  mv.setViewName("login");  
			  }
			  
		  } else {
			  mv.addObject("error","Password and Confirm Password Dosn't Match ");
			  mv.setViewName("register");
		  }
		  return mv;
	  }
	 
	@RequestMapping("/user/authenticate")
	public ModelAndView loginAuthentication(String username, String password) {
	logger.info("authentication in web controller");
		String name = loginRegisterService.authentication(username, password);
		ModelAndView mv = new ModelAndView();
		if("success".equals(name)) {
			  mv.setViewName("home"); 
		  } else {
			  mv.addObject("error","Username or Password incorrect");
			  mv.setViewName("login");
		  }
		return mv;
	}
	

	@RequestMapping("/setProfile")
	public ModelAndView getEmployee() {
		logger.info("Setting a new profile");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("setProfile");
		return mv;
	}

	@RequestMapping("/saveDetails")
	public ModelAndView user(Address address) {
		logger.info("Saving address details to DB");
		addressService.save(address);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
     	return mv;
	}


}
