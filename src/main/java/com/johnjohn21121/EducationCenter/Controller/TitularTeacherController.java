package com.johnjohn21121.EducationCenter.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.johnjohn21121.EducationCenter.Dao.TitularTeacherDao;
import com.johnjohn21121.EducationCenter.Persons.TitularTeacher;

@RestController
@RequestMapping("/titularteachers")
public class TitularTeacherController {

	@Autowired
	TitularTeacherDao titularDao;
	
	@GetMapping
	@ResponseBody
	public List<TitularTeacher> getTitularTeachers(){
		return titularDao.findAll();
	}
	
	@GetMapping("/titularteacher/{titularTeacherId}")
	@ResponseBody
	public Optional<TitularTeacher> getTitularTeacherById(@PathVariable("titularTeacherId")
											int titularTeacherId){
		
		return titularDao.findById(titularTeacherId);
	}
	
	
	
}
