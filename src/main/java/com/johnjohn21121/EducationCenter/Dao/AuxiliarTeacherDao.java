package com.johnjohn21121.EducationCenter.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.johnjohn21121.EducationCenter.Persons.AuxiliarTeacher;

@Component
public interface AuxiliarTeacherDao extends JpaRepository<AuxiliarTeacher,Integer> {

}
