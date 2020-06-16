package com.johnjohn21121.EducationCenter.Institute;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.johnjohn21121.EducationCenter.Persons.Student;

@Entity
@Table(name = "registration")
public class CourseRegistration {
	
	@Id
	@Column(name = "registration_id")
	int id;
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	Student student;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	Courses course;
	
	LocalDateTime localTime;
	
	
	public CourseRegistration() {
	}

	public CourseRegistration(int id, Student student, Courses course, LocalDateTime localTime) {
		this.id = id;
		this.student = student;
		this.course = course;
		this.localTime = localTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	public LocalDateTime getLocalTime() {
		return localTime;
	}

	public void setLocalTime(LocalDateTime localTime) {
		this.localTime = localTime;
	}
	
}
