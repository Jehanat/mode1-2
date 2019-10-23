package com.hcl.student.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hcl.student.model.Student;



public interface StudentDAO {

	public void addStudent(Student student);

	public List<Student> getAllStudents();

	public void deleteStudent(Integer rollNum);

	public Student updateStudent(Student student);

	public Student getStudent(int rollNum);
}

	

