package com.genspark.studentAssignmt;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class StudentAssignmtApplication {

	public static void main(String[] args) {

		//SpringApplication.run(StudentAssignmtApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student = context.getBean(Student.class);
		Address address = context.getBean(Address.class);
		student.config();
	}

}
