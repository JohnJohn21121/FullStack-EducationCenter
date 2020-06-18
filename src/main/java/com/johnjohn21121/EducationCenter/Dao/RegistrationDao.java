package com.johnjohn21121.EducationCenter.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.johnjohn21121.EducationCenter.Institute.CourseRegistration;
import com.johnjohn21121.EducationCenter.Persons.Student;

@EnableJpaRepositories
@Repository
public interface RegistrationDao extends JpaRepository<CourseRegistration,Integer> {

	

}
