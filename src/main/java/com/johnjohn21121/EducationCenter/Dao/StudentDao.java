package com.johnjohn21121.EducationCenter.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.sql.*;
import com.johnjohn21121.EducationCenter.Persons.Student;

@Component
public interface StudentDao extends JpaRepository<Student,Integer>{
	
	
}
