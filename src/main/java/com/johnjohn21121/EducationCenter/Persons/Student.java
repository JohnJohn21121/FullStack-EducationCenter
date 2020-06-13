package com.johnjohn21121.EducationCenter.Persons;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;


@Entity
public class Student {
	
	@Id
    private int studentId;
    
	@Column(name = "name")
	private String studentName;
    
    @Column(name="last_name")
    private String studentLastName;
    
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "enrollmentDate")
    private Date enrollmentDate;
    
 
    
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
    @PrePersist
	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
    
    
}
