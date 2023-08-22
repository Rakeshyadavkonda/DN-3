package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String studentId;
    private String studentName;
    private List<Test> studentTests;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<Test> getStudentTests() {
		return studentTests;
	}
	public void setStudentTests(List<Test> studentTests) {
		this.studentTests = studentTests;
	}
	
	
	public void addTest(Test test) {
        if (studentTests == null) {
            studentTests = new ArrayList<>();
        }
        studentTests.add(test);
    }
}
