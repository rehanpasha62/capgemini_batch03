package com.example.placementmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.placementmanagement.entity.CollegeEntity;
import com.example.placementmanagement.repository.CollegeRepo;

@Service
public class CollegeService {

	@Autowired
	private CollegeRepo collegeRepo;
	
//	create
	public CollegeEntity createCollege(CollegeEntity collegeEntity) {
		return collegeRepo.save(collegeEntity);
		
	}
	
//	read
	public List<CollegeEntity> getCollege(){
		return (List<CollegeEntity>)collegeRepo.findAll();
		
	}
	
//	delete
	public void deleteCollege(long id) {
		collegeRepo.deleteById(id);
	}
	
//	update
	public CollegeEntity updateCollege(long id , CollegeEntity collegeEntity) {
		 CollegeEntity existCollege = collegeRepo.findById(id).orElse(null);
		 
		 if(existCollege != null) {
			 existCollege.setCollegeName(collegeEntity.getCollegeName());
			 existCollege.setLocation(collegeEntity.getLocation());
		 }
		 return collegeRepo.save(existCollege);
		 
		 
	}
}
