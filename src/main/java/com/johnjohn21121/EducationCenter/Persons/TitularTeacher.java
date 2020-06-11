package com.johnjohn21121.EducationCenter.Persons;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TitularTeacher  {
	
	@Id
	private int teacherId;
	private String speciality;
    private String teacherName;
    private String teacherLastName;

    public TitularTeacher() {
    }

    public TitularTeacher(int teacherId, String teacherName, String teacherLastName, String speciality) {
        this.speciality = speciality;
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherLastName = teacherLastName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherLastName() {
        return teacherLastName;
    }

    public void setTeacherLastName(String teacherLastName) {
        this.teacherLastName = teacherLastName;
    }

}
