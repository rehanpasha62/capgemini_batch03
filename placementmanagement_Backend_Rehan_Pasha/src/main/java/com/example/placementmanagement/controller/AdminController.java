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

import com.example.placementmanagement.entity.AdminEntity;
import com.example.placementmanagement.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	
  
	@PostMapping("/saveadmin")
	public AdminEntity registerAdmin(@RequestBody AdminEntity adminEntity) {
		return adminService.registerAdmin(adminEntity);
		
	}
	
	@GetMapping("/getadmin")
	public List<AdminEntity> getAdmin(){
		return adminService.getAdmin();
		
	}
	
	@DeleteMapping("/deleteadmin/{id}")
	public void deleteAdmin(@PathVariable("id")Long id) {
		adminService.deleteAdmin(id);
	}
	
	@PutMapping("/updateadmin/{id}")
	public AdminEntity updateAdmin(@PathVariable("id") Long id, @RequestBody AdminEntity adminEntity) {
		return adminService.updateAdmin(id,adminEntity);
		
	}
}
