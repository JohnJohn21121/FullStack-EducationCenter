package com.johnjohn21121.EducationCenter.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.johnjohn21121.EducationCenter.Dao.AuxiliarTeacherDao;
import com.johnjohn21121.EducationCenter.Persons.AuxiliarTeacher;

@RestController
@RequestMapping("/auxiliarteachers")
public class AuxiliarTeacherController {
	
	@Autowired
	AuxiliarTeacherDao auxiliarDao;
	
	@GetMapping
	@ResponseBody
	public List<AuxiliarTeacher> getAuxiliarTeachers(){
		return auxiliarDao.findAll();
	}
	
	@GetMapping("/auxiliarteacher/{teacherId}")
	@ResponseBody
	public Optional<AuxiliarTeacher> getAuxiliarTeacherById(@PathVariable("teacherId")int teacherId){
		return auxiliarDao.findById(teacherId);
	}
	
	@PostMapping("/auxiliarteacher")
	public AuxiliarTeacher addAuxiliarTeacher(@RequestBody AuxiliarTeacher auxiliarTeacher) {
		auxiliarDao.save(auxiliarTeacher);
		return auxiliarTeacher;
	}
	
	@DeleteMapping("/auxiliarteacher/{teacherId}")
	public void removeTeacherById(@PathVariable("teacherId")int teacherId) {
		auxiliarDao.deleteById(teacherId);
	}
	
	@PutMapping("/auxiliarteacher/{teacherId}")
	public AuxiliarTeacher updateTeacherById(@PathVariable("teacherId")int teacherId,
			@RequestBody AuxiliarTeacher auxiliarTeacher) {
		AuxiliarTeacher aux1 = auxiliarDao.findById(teacherId).orElse(null);
		aux1.setTeacherName(auxiliarTeacher.getTeacherName());
		aux1.setTeacherLastName(auxiliarTeacher.getTeacherLastName());
		AuxiliarTeacher updatedTeacher= auxiliarDao.save(aux1);
		return updatedTeacher;
	}
	
	@PutMapping("/auxiliarteachercoach/{teacherId}")
	public AuxiliarTeacher updateCoachingHours(@PathVariable("teacherId")int teacherId,
				@RequestBody AuxiliarTeacher auxiliarTeacher) {
		AuxiliarTeacher aux1 = auxiliarDao.findById(teacherId).orElse(null);
		aux1.setCoachingHours(auxiliarTeacher.getCoachingHours());
		AuxiliarTeacher updatedTeacher = auxiliarDao.save(aux1);
		return updatedTeacher;
	}
	
}
