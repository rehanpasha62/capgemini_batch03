package com.example.placementmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.placementmanagement.entity.StudentEntity;
import com.example.placementmanagement.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService  studentService;
	
	@PostMapping("/savestudent")
	public StudentEntity createStudent(@RequestBody StudentEntity studentEntity) {
		return studentService.crateStudent(studentEntity);
	}
	
	@GetMapping("/getstudent")
	public List<StudentEntity> getStudent(){
		return studentService.getStudents();
	}
	
	@PutMapping("/updatestudent/{id}")
	public StudentEntity updateStudent(@PathVariable("id")Integer id,@RequestBody StudentEntity studentEntity) {
		return studentService.updateStudent(id, studentEntity);
		
	}
	
	@DeleteMapping("/deletestudent/{id}")
	public void deletestudents(@PathVariable("id") Integer sid) {
		studentService.deleteStudent(sid);
	}
	
}
