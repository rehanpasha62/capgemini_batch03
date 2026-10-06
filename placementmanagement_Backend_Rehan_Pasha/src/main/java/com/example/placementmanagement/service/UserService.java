package com.example.placementmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.placementmanagement.entity.UserEntity;
import com.example.placementmanagement.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
//	create admin;
	public UserEntity registerUser(UserEntity userEntity) {
		return userRepo.save(userEntity);
		
	}
	
//	read
	public List<UserEntity> getUserEntity(){
		return(List<UserEntity>)userRepo.findAll();
		
	}
	
//	delete
	public void deleteUser(long id) {
		userRepo.deleteById(id);
	}
	
//	updae
	public UserEntity updateUser(long id,UserEntity userEntity) {
		
		UserEntity existUser = userRepo.findById(id).orElse(null);
		
		if(existUser != null) {
			existUser.setName(userEntity.getName());
			existUser.setEmail(userEntity.getEmail());
			existUser.setDesignation(userEntity.getDesignation());
		}
		return userRepo.save(existUser);
		
		
	}
	


}
