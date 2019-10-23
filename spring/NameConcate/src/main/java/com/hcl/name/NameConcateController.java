package com.hcl.name;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameConcateController {
	@RequestMapping("/concate")
	public ModelAndView calc(HttpServletRequest req,HttpServletResponse res){
		String firstName;
		String secondName;
		
		firstName=req.getParameter("firstName");
		secondName=req.getParameter("secondName");
		String result=firstName+"  "+secondName;
		return new ModelAndView("result","result",result);

	}

}

