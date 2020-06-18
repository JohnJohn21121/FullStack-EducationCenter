package com.johnjohn21121.EducationCenter.Controller;

import java.util.ArrayList;
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

import com.johnjohn21121.EducationCenter.Dao.CourseDao;
import com.johnjohn21121.EducationCenter.Dao.RegistrationDao;
import com.johnjohn21121.EducationCenter.Institute.CourseRegistration;
import com.johnjohn21121.EducationCenter.Institute.Courses;
import com.johnjohn21121.EducationCenter.Persons.Student;

@RestController
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
	private CourseDao courseDao;
	
	@Autowired
	private RegistrationDao registrationDao;
	
	@GetMapping
	@ResponseBody
	public List<Courses> getAllCourses(){
		return courseDao.findAll();
	}
	
	@GetMapping("/course/{courseId}")
	@ResponseBody
	public Optional<Courses> getCourseById(@PathVariable("courseId")int courseId) {
		return courseDao.findById(courseId);
	}
	
	@GetMapping("/course/{courseName}")
	@ResponseBody
	public Courses getCourseByName(@PathVariable("courseName")String courseName){
		for(int i = 0;i<getAllCourses().size();i++) {
			if(courseName == courseDao.findById(i).get().getCourseName()) {
				Courses c1 = courseDao.findById(i).get();
				return c1;
			}
		}
		return null;
	}
		
	@PostMapping("/course")
	public Courses addCourse(@RequestBody Courses course) {
		courseDao.save(course);
		return course;
	}
	
	@DeleteMapping("/course/{courseId}")
	public void deleteCourseById(@PathVariable("courseId")int courseId) {
		courseDao.deleteById(courseId);
	}
	
	@PutMapping("/course/{courseId}")
	public Courses updateCourse(@PathVariable("courseId")int courseId,@Validated @RequestBody Courses c1) {
		Courses course = courseDao.findById(courseId).get();
		course.setCourseName(c1.getCourseName());
		course.setCourseClassRoom(c1.getCourseClassRoom());
		courseDao.save(course);
		return course;
	}
	
	
	
}
