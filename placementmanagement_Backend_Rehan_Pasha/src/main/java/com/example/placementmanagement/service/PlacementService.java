package com.example.placementmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.placementmanagement.entity.PlacementEntity;
import com.example.placementmanagement.repository.PlacementRepo;

@Service
public class PlacementService {

	@Autowired
	private PlacementRepo placementRepo;
	
//	create
	public PlacementEntity createPlace(PlacementEntity placementEntity) {
		return placementRepo.save(placementEntity);
		
	}
	
	
//	read
	public List<PlacementEntity> getPlacement(){
		return (List<PlacementEntity>)placementRepo.findAll();
	}
	
//	update
	public PlacementEntity updatePlacement(long id,PlacementEntity placementEntity) {
		
		PlacementEntity existPlacement = placementRepo.findById(id).orElse(null);
		
		if(existPlacement != null) {
			
			existPlacement.setName(placementEntity.getName());
			existPlacement.setQualification(placementEntity.getQualification());
			existPlacement.setYear(placementEntity.getYear());
		}
		
		
		return placementRepo.save(existPlacement);
		
	}
	
	
//	delete
	public void deletePlacement(long id) {
		placementRepo.deleteById(id);;
	}
	
}
