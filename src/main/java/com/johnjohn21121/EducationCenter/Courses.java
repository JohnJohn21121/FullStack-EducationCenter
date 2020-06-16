package com.johnjohn21121.EducationCenter;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.johnjohn21121.EducationCenter.Persons.AuxiliarTeacher;
import com.johnjohn21121.EducationCenter.Persons.Student;
import com.johnjohn21121.EducationCenter.Persons.TitularTeacher;

@Entity
public class Courses {
	
	@Id
    private int courseId;
    private String courseName;
    private String courseEdition;
    private String courseClassRoom;
//    @ManyToOne
//    private TitularTeacher titularTeacher;
//    @ManyToOne
//    private AuxiliarTeacher auxiliarTeacher;
    private int courseVacancy;
    @ManyToMany
    @JoinTable(name="Students_Courses",joinColumns= {@JoinColumn(name="Course_Id")},
    		inverseJoinColumns = {@JoinColumn(name="Student_Id")})
    private List<Student> students;
    
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
//	public TitularTeacher getTitularTeacher() {
//		return titularTeacher;
//	}
//	public void setTitularTeacher(TitularTeacher titularTeacher) {
//		this.titularTeacher = titularTeacher;
//	}
//	public AuxiliarTeacher getAuxiliarTeacher() {
//		return auxiliarTeacher;
//	}
//	public void setAuxiliarTeacher(AuxiliarTeacher auxiliarTeacher) {
//		this.auxiliarTeacher = auxiliarTeacher;
//	}
	public int getCourseVacancy() {
		return courseVacancy;
	}
	public void setCourseVacancy(int courseVacancy) {
		this.courseVacancy = courseVacancy;
	}
	
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	

    
}
