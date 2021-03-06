package com.johnjohn21121.EducationCenter.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.johnjohn21121.EducationCenter.Persons.TitularTeacher;

@EnableJpaRepositories
@Repository
public interface TitularTeacherDao extends JpaRepository<TitularTeacher,Integer>{

}
