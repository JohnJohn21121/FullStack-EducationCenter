package com.johnjohn21121.EducationCenter.Persons;

<<<<<<< HEAD
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
=======
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

>>>>>>> 26a862241b36c2b80545ae8e2fe79685b2b73090

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@Column(name = "student_id")
    private int studentId;
    
	@Column(name = "name")
	private String studentName;
    
    @Column(name="last_name")
    private String studentLastName;
    
<<<<<<< HEAD
    @OneToMany(mappedBy = "student")
    Set<CourseRegistration> registration;
    
=======
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "enrollmentDate")
    private Date enrollmentDate;
    
 
>>>>>>> 26a862241b36c2b80545ae8e2fe79685b2b73090
    
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
<<<<<<< HEAD

	public Set<CourseRegistration> getRegistration() {
		return registration;
	}

	public void setRegistration(Set<CourseRegistration> registration) {
		this.registration = registration;
	}

	
   
=======
    @PrePersist
	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
    
>>>>>>> 26a862241b36c2b80545ae8e2fe79685b2b73090
    
}
