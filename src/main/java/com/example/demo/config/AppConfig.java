package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Student;
import com.example.demo.model.Test;

@Configuration
public class AppConfig {

    @Bean
    public Test coreJavaTest() {
        Test test = new Test();
        test.setTestId("T001");
        test.setTestTitle("Core Java Test");
        test.setTestMarks(80);
        return test;
    }

    @Bean
    public Student student1(Test coreJavaTest) {
        Student student = new Student();
        student.setStudentId("S001");
        student.setStudentName("Steve");
        student.addTest(coreJavaTest);  // only one test for first student
        return student;
    }

    @Bean
    public Student student2(Test coreJavaTest) {
        Student student = new Student();
        student.setStudentId("S002");
        student.setStudentName("Alice");
        student.addTest(coreJavaTest);
        student.addTest(coreJavaTest); // Second test for the second student
        return student;
    }
}

