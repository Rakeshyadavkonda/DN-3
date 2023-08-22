package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.config.AppConfig;
import com.example.demo.model.Student;

@SpringBootApplication
public class WiproAssignment3Application {

	public static void main(String[] args) {
	//	SpringApplication.run(WiproAssignment3Application.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Student student1 = context.getBean("student1", Student.class);
        Student student2 = context.getBean("student2", Student.class);

        System.out.println("Student 1:");
        System.out.println("ID: " + student1.getStudentId());
        System.out.println("Name: " + student1.getStudentName());
        System.out.println("Tests: " + student1.getStudentTests().size());

        System.out.println("Student 2:");
        System.out.println("ID: " + student2.getStudentId());
        System.out.println("Name: " + student2.getStudentName());
        System.out.println("Tests: " + student2.getStudentTests().size());

        context.close();
	}

}
