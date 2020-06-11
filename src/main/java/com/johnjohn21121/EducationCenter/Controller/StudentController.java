package com.johnjohn21121.EducationCenter.Controller;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.johnjohn21121.EducationCenter.Dao.StudentDao;
import com.johnjohn21121.EducationCenter.Persons.Student;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentDao studentDao;
	
	@GetMapping
	@ResponseBody
	public List<Student> getStudents(){
		return studentDao.findAll();
	}
	
	@GetMapping("/studentid/{studentId}")
	@ResponseBody
	public Optional<Student> getStudentById(@PathVariable("studentId")int studentId){
		return studentDao.findById(studentId);
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student){
		studentDao.save(student);
		return student;
	}
	
	@DeleteMapping("/student/{studentId}")
	public void deleteStudent(@PathVariable("studentId")int studentId) {
		studentDao.deleteById(studentId);
	}
	
	@DeleteMapping("/exterminate")
	public void deleteAllStudents() {
		studentDao.deleteAll();
	}
	
	@PutMapping("/updatestudent/{studentId}")
	public Student updateStudent(@PathVariable("studentId")int studentId,
			@Validated @RequestBody Student student){
		
		Student st = studentDao.findById(studentId).orElse(null);
		st.setStudentName(student.getStudentName());
		st.setStudentLastName(student.getStudentLastName());
		Student updatedStudent = studentDao.save(st);
		
		return updatedStudent;
	}
}
