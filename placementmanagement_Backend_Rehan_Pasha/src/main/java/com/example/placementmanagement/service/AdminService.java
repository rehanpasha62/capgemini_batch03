package com.example.placementmanagement.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.placementmanagement.entity.AdminEntity;
import com.example.placementmanagement.repository.AdminRepo;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepo adminRepo;
	
//	create
	public AdminEntity registerAdmin(AdminEntity adminEntity) {
		return adminRepo.save(adminEntity);
		
	}
	
//	read
	public List<AdminEntity> getAdmin(){
		return (List<AdminEntity>)adminRepo.findAll();
	}
	
//	delete
	public void deleteAdmin(Long id) {
		adminRepo.deleteById(id);
	}
	
	
//	update
	public AdminEntity updateAdmin(Long id, AdminEntity adminEntity) {

	    AdminEntity existAdmin = adminRepo.findById(id).orElse(null);

	    if (existAdmin != null) {
	        existAdmin.setName(adminEntity.getName());
	        existAdmin.setPassword(adminEntity.getPassword());
	    }

	    return adminRepo.save(existAdmin);
	}
	

}
