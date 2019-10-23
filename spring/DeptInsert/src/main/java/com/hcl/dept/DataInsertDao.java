package com.hcl.dept;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class DataInsertDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void insertDepartment(){
		int deptno;
		String dname,loc,head;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department No: ");
		deptno=Integer.parseInt(sc.nextLine());
		System.out.println("Name of the Department: ");
		dname=sc.nextLine();
		System.out.println("Department Location: ");
		loc=sc.nextLine();
		System.out.println("Head of the Department: ");
		head=sc.nextLine();
		
		String cmd="insert into Department values(?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[]
				{
						deptno,
						dname,
						loc,
						head,
						
				});
		
				}
		
	}

