package com.hcl.dept;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DepartmentShowController {
	@RequestMapping("/DeptInsert")
	public ModelAndView insertEmp(HttpServletRequest req){  
		int deptno=Integer.parseInt(req.getParameter("deptno"));
		String dname=req.getParameter("dname");
		String loc=req.getParameter("loc");
		String head=req.getParameter("head");

		ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		DataSource dataSource=(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		String cmd="insert into department values(?,?,?,?)";
		
		jt.update(cmd,new Object[]{deptno,dname,loc,head});

			
			return(new ModelAndView("InsertPage","message","Record Inserted"));}
	@RequestMapping("/deptsearch")
	public ModelAndView searchDept(HttpServletRequest req){
		int deptno=Integer.parseInt(req.getParameter("deptno"));		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		DataSource dataSource=(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		String sql="select * from department where deptno=?";
		List dept=null;
		dept =jt.query(sql,new Object[]{deptno},new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				String deptInfo=rs.getInt("deptno") +"----"+
						rs.getString("dname")+ "-------"+
						rs.getString("loc")+ "--------"+
						rs.getString("head") ;

							return deptInfo;
						}
					});	
			return(new ModelAndView("ShowPage","dept",dept));
	
		
	}
	@RequestMapping("/departmentshow")
	public ModelAndView showDept(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		DataSource dataSource=(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		String sql="select * from department";
		List dept=null;
		dept =jt.query(sql,new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				String deptInfo=rs.getInt("deptno") +"----"+
						rs.getString("dname")+ "-------"+
						rs.getString("loc")+ "--------"+
						rs.getString("head") ;

							return deptInfo;
						}
					});	
			return(new ModelAndView("ShowPage","dept",dept));
	
		
	}

}


