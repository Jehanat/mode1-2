package com.jenny.java8streams.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;



import com.jenny.java8streams.model.Employee;
import com.jenny.java8streams.service.EmployeeService;

@Controller
public class EmployeeController {

	

		private static final Logger logger = Logger
				.getLogger(EmployeeController.class);

		public EmployeeController() {
			logger.info("This is Jenny's Program");
			System.out.println("EmployeeController()");
		}

		@Autowired
		private EmployeeService employeeService;

		@RequestMapping(value = "/")
		public ModelAndView listEmployee(ModelAndView model) throws IOException {
			logger.debug("debug:" +new Date() +this.getClass()+"listEmployee()" +"entering into");

			List<Employee> listEmployee = employeeService.getAllEmployees();
			logger.debug("debug:" +new Date() +this.getClass()+"listEmployee()" +"Calling the employee service");

			model.addObject("listEmployee", listEmployee);
			logger.debug("debug:" +new Date() +this.getClass()+"listEmployee()" +"employee service calling is completed and no of employees");

			model.setViewName("home");
			logger.debug("debug:" +new Date() +this.getClass()+"listEmployee()" +"redirect to home");

			return model;
		}

}
