package com.johnjohn21121.EducationCenter.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.johnjohn21121.EducationCenter.Institute.CourseRegistration;

@EnableJpaRepositories
@Repository
public interface RegistrationDao extends JpaRepository<CourseRegistration,Integer> {

}
