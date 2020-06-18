package com.johnjohn21121.EducationCenter.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/titularteacher")
	public TitularTeacher addTitularTeacher(@RequestBody TitularTeacher titularTeacher) {
		titularDao.save(titularTeacher);
		return titularTeacher;
	}
	
	@DeleteMapping("/titularteacher/{titularTeacherId}")
	public void removeTitularTeacher(@PathVariable("titularTeacherId")int titularTeacherId) {
		titularDao.deleteById(titularTeacherId);
	}
	
	@PutMapping("/titularteacher/{titularTeacherId}")
	public TitularTeacher updateTitularTeacher(@PathVariable("titularTeacherId")int titularTeacherId,
						@Validated @RequestBody TitularTeacher titular) {
		TitularTeacher t1 = titularDao.findById(titularTeacherId).orElse(null);
		t1.setTeacherName(titular.getTeacherName());
		t1.setTeacherLastName(titular.getTeacherLastName());
		TitularTeacher updatedTeacher = titularDao.save(t1);
		return updatedTeacher;
		
	}
	
	@PutMapping("/teacherspec/{titularTeacherId}")
	public TitularTeacher updateSpeciality(@PathVariable("titularTeacherId")int titularTeacherId,
						@Validated @RequestBody TitularTeacher titular) {
		TitularTeacher t1 = titularDao.findById(titularTeacherId).orElse(null);
		t1.setSpeciality(titular.getSpeciality());
		TitularTeacher updatedTeacher= titularDao.save(t1);
		return updatedTeacher;
	}
	
}
