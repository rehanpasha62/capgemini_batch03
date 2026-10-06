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

import com.example.placementmanagement.entity.PlacementEntity;
import com.example.placementmanagement.service.PlacementService;

@RestController
public class PlacementController {

	@Autowired
	private PlacementService placementService;
	
	
	@PostMapping("/saveplacement")
	public PlacementEntity createPlacement(@RequestBody PlacementEntity placementEntity) {
		return placementService.createPlace(placementEntity);
	}
	
	@GetMapping("/getplacement")
	public List<PlacementEntity> getplacement(){
		return (List<PlacementEntity>)placementService.getPlacement();
	}
	
	@PutMapping("/updateplace/{id}")
	public PlacementEntity updateplacement(@PathVariable("id") long id,@RequestBody PlacementEntity placementEntity) {
		return placementService.updatePlacement(id, placementEntity);
		
	}
	
	@DeleteMapping("/deleteplace/{id}")
	public void deletePlace(@PathVariable("id")long id) {
		placementService.deletePlacement(id);
	}
}
