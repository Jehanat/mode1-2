package com.jehanat.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EmployController {

	@Autowired
	EmployRepository dao;
	int numRecords=2;
	int numOfPages;

	@RequestMapping("/")
	public ModelAndView getEmployees() {
		ModelAndView mv = new ModelAndView();
		List<Employ> employList=(List<Employ>)dao.findAll();
		numOfPages=employList.size()/numRecords + employList.size()%numRecords;
	    mv.addObject("pages",numOfPages);
		mv.addObject("employList",employList);
		
		//mv.addObject("employList", dao.findAll());
	//	mv.addObject("totalrecords", employList.size());
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("/displayjavaengineers")
	public ModelAndView getJavaEngineers() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employList", dao.findByDeptAndDesig("Java", "Engineer"));
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("/salaryjava")
	public ModelAndView getSalaryJavaProgrammers() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employList", dao.findBySalary("Java","Programmer", 40000));
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("/salaryemploy")
	public ModelAndView getSalaryEmploy() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employList", dao.findByEmployeeSalary("Java","Programmer", 40000,"S"));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displayAllSortByDesig")
	public ModelAndView displayAllSortByDesig() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employList", dao.findAll(Sort.by("desig")));
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("/displayAllSortDescByDesig")
	public ModelAndView displayAllSortDescByDesig() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employList", dao.findAll(Sort.by("desig").descending()));
		mv.setViewName("home");
		return mv;
	}
	
//	/displayAllSortDesc
	@RequestMapping("/displayAllSortDesc")
	public ModelAndView displayAllSortDesc() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employList", dao.findAll(Sort.by("dept","basic").descending()));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/JavaProgrammerBySalary")
	public ModelAndView JavaProgrammerBySalary() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employList", dao.findByDeptAndDesig("Java", "Programmer","basic"));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displayAll/Page/{pageno}")
	public ModelAndView displayAllSortByDesig(@PathVariable("pageno") int pageno)
	{
		ModelAndView mv = new ModelAndView();
		Page<Employ> pages=dao.findAll(PageRequest.of(pageno, numRecords));
        mv.addObject("pages",numOfPages);
		mv.addObject("employList",(pages).getContent());
		mv.setViewName("home");
		return mv;
	}
	
	}
	
	
	
//	
//
//	@RequestMapping("/salaryjava")
//	public ModelAndView getJavaSalary() {
//		ModelAndView mv = new ModelAndView();
//	mv.addObject("employList", dao.findByEmployeeSalary(name, dept, desig, basic));
//	mv.setViewName("home");
//	return mv;
//	}
//	@RequestMapping("/salaryemploy")
//	public ModelAndView getEmploySalary() {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("employList", dao.findByEmployeeSalary("S   ", " ", "  ",78906));
//		mv.setViewName("home");
//		return mv;
	
