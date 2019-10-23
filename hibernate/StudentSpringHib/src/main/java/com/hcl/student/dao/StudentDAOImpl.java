package com.hcl.student.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.student.dao.StudentDAO;
import com.hcl.student.model.Student;


	@Repository
	public class StudentDAOImpl implements StudentDAO {

		@Autowired
		private SessionFactory sessionFactory;

		public void addStudent(Student student) {
			sessionFactory.getCurrentSession().saveOrUpdate(student);

		}

		@SuppressWarnings("unchecked")
		public List<Student> getAllStudents() {

			return sessionFactory.getCurrentSession().createQuery("from Student")
					.list();
		}

		public void deleteStudent(Integer rollNum) {
			Student student = (Student) sessionFactory.getCurrentSession().load(
					Student.class, rollNum);
			if (null != student) {
				this.sessionFactory.getCurrentSession().delete(student);
			}

		}

		public Student getStudent(int rollNum) {
			return (Student) sessionFactory.getCurrentSession().get(
					Student.class, rollNum);
		}

		public Student updateStudent(Student student) {
			sessionFactory.getCurrentSession().update(student);
			return student;
		}

	}

