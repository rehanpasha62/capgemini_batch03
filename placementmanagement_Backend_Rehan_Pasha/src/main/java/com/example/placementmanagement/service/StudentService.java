package com.example.placementmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.placementmanagement.entity.StudentEntity;
import com.example.placementmanagement.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
//	create
	public StudentEntity crateStudent(StudentEntity studentEntity) {
		return studentRepo.save(studentEntity);
		
	}
	
//	read
	public List<StudentEntity> getStudents(){
		return (List<StudentEntity>)studentRepo.findAll();
	}
	
//	update
	public StudentEntity updateStudent(Integer sid,StudentEntity studentEntity) {
		 StudentEntity  existStudent = studentRepo.findById(sid).orElse(null);
		 
		 if(existStudent != null) {
			 existStudent.setName(studentEntity.getName());
			 existStudent.setCollegeName(studentEntity.getCollegeName());
			 existStudent.setPhoneno(studentEntity.getPhoneno());
		 }
		 return studentRepo.save(existStudent);
	}
	
//	delete
	public void deleteStudent(int sid) {
		studentRepo.deleteById(sid);
	}
}
