package com.adarsh.springjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.adarsh.springjdbc.models.Student;
import com.adarsh.springjdbc.services.StudentService;

@SpringBootApplication
public class SpringjdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringjdbcApplication.class, args);
		Student s=context.getBean(Student.class);
	    s.setRollNo(10);
		s.setMarks(23);
		s.setName("Adarsh");

		StudentService service=context.getBean(StudentService.class);
		service.addStudent(s);
		System.out.println(service.getAllStudents());
		System.out.println("Hello");
	}

}
