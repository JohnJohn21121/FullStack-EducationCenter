package com.johnjohn21121.EducationCenter.Persons;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
    private int studentId;
    private String studentName;
    private String studentLastName;

    public Student() {

    }
    
    

    public Student(String studentName, String studentLastName) {
		this.studentName = studentName;
		this.studentLastName = studentLastName;
	}



	public Student(int studentId, String studentName, String studentLastName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentLastName = studentLastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }
}
