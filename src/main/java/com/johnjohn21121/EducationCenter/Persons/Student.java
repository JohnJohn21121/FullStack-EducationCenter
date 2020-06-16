package com.johnjohn21121.EducationCenter.Persons;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.johnjohn21121.EducationCenter.Institute.CourseRegistration;
import com.johnjohn21121.EducationCenter.Institute.Courses;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@Column(name = "student_id")
    private int studentId;
    private String studentName;
    private String studentLastName;
    
    @OneToMany(mappedBy = "student")
    Set<CourseRegistration> registration;
    
    
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

	public Set<CourseRegistration> getRegistration() {
		return registration;
	}

	public void setRegistration(Set<CourseRegistration> registration) {
		this.registration = registration;
	}

	
   
    
}
