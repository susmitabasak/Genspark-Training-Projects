package com.genspark.studentAssignmt;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class StudentAssignmtApplication {

	public static void main(String[] args) {

		//SpringApplication.run(StudentAssignmtApplication.class, args);

//		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Resource r = new ClassPathResource("Spring.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Student stud1 = (Student) factory.getBean("student1");
		System.out.println("Student1 details - " + stud1.toString());
		System.out.println("After first..........................................");

		Student stud2 = (Student) factory.getBean("student2");
		System.out.println("Student2 details - " + stud2.toString());
		System.out.println("After second..........................................");

		Student stud3 = (Student) factory.getBean("student3");
		System.out.println("Student3 details - " + stud3.toString());
	}

}
