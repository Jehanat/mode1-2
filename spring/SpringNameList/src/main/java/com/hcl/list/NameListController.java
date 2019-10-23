package com.hcl.list;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameListController {
@RequestMapping("/names")
public ModelAndView nameDemo(){
	List<String> lstNames=new ArrayList<String>();
	lstNames.add("Jehanat");
	lstNames.add("Sabahat");
	lstNames.add("Zirgham");
	lstNames.add("Shresth");
	lstNames.add("Sharmeen");
	return new ModelAndView("ShowPage","lists",lstNames);

}
}
