package com.johnjohn21121.EducationCenter.Institute;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.johnjohn21121.EducationCenter.Persons.AuxiliarTeacher;
import com.johnjohn21121.EducationCenter.Persons.Student;
import com.johnjohn21121.EducationCenter.Persons.TitularTeacher;

@Entity
@Table(name = "courses")
public class Courses {
	
	@Id
	@Column(name = "course_id")
    private int courseId;
    private String courseName;
    private String courseEdition;
    private String courseClassRoom;
    
    @OneToMany(mappedBy = "course")
    Set<CourseRegistration> registrations;
    
    
	public int getCourseId() {
		return courseId;
	}
	
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseEdition() {
		return courseEdition;
	}
	
	public void setCourseEdition(String courseEdition) {
		this.courseEdition = courseEdition;
	}
	
	public String getCourseClassRoom() {
		return courseClassRoom;
	}
	
	public void setCourseClassRoom(String courseClassRoom) {
		this.courseClassRoom = courseClassRoom;
	}

	public Set<CourseRegistration> getRegistrations() {
		return registrations;
	}

	public void setRegistrations(Set<CourseRegistration> registrations) {
		this.registrations = registrations;
	}

		
}