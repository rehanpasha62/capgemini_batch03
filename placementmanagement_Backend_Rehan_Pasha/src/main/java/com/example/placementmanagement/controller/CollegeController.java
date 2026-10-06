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

import com.example.placementmanagement.entity.CollegeEntity;
import com.example.placementmanagement.service.CollegeService;

@RestController
public class CollegeController {

	@Autowired
	private CollegeService collegeService;
	
	@PostMapping("/savecollege")
	public CollegeEntity createcollege(@RequestBody CollegeEntity collegeEntity) {
		return collegeService.createCollege(collegeEntity);
		
	}
	
	@PutMapping("/updatecollege/{id}")
	public CollegeEntity updateCollege(@PathVariable("id")Long id,@RequestBody CollegeEntity collegeEntity) {
		return collegeService.updateCollege(id, collegeEntity);
	}
	
	@GetMapping("/getcollege")
	public List<CollegeEntity> getCollege() {
		return collegeService.getCollege();
	}
	
	@DeleteMapping("/deletecollege/{id}")
	public void deleteCollege(@PathVariable("id")long id) {
		 collegeService.deleteCollege(id);
	}
}
