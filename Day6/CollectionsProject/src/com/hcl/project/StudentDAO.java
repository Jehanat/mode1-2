package com.hcl.project;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
static List<Student> lstStudent=null;
static{
	lstStudent=new ArrayList<Student>();
}
public String addStudentDao(Student student){
lstStudent.add(student);
return "Student created successfully..";
}
public Student searchStudentDao(int sno){
	Student objStudent=null;
	for(Student student:lstStudent){
		if(student.getSno()==sno){
			objStudent=student;
		}
	}
	return objStudent;
	
}
public List<Student>showsStudentDao
(){
	return  lstStudent;
}

public String updateStudentDao(Student objStudent){
	Student student=searchStudentDao(objStudent.getSno());
	if(student!=null){
		for(Student s: lstStudent){
			if(s.getSno()==objStudent.getSno()){
				s.setName(objStudent.getName());
				s.setCity(objStudent.getCity());
				s.setCgpa(objStudent.getCgpa());
			}
		}
		return "Record Updated...";
	}else{
		return "Student no. not found!...";
			}
		}
	public String deleteStudentDao(int sno){
		Student student=searchStudentDao(sno);
		if(student!=null){
			lstStudent.remove(student);
			return "Student Removed";
		}else{
			return "Student not found!";
		
		}
}}


