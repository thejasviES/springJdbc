package com.thejasvi.SpringJDBCH2;

import com.thejasvi.SpringJDBCH2.model.Student;
import com.thejasvi.SpringJDBCH2.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbch2Application {

	public static void main(String[] args) {
		ApplicationContext context=	SpringApplication.run(SpringJdbch2Application.class, args);
		Student s= context.getBean(Student.class);
		s.setRollNo(104);
		s.setName("thejasvi");
		s.setMarks(66);
		StudentService service=context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students=service.getStudents();
		System.out.println(students);

	}

}
