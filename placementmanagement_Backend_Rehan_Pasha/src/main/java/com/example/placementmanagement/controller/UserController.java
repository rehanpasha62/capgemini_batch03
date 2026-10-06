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

import com.example.placementmanagement.entity.UserEntity;
import com.example.placementmanagement.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService  userService;
	
	@PostMapping("/saveuser")
	public UserEntity registerUser(@RequestBody UserEntity userEntity) {
		return userService.registerUser(userEntity);
		
	}
	
	@GetMapping("/getuser")
	public List<UserEntity> getUser(){
		return userService.getUserEntity();
		
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public void deleteUser(@PathVariable("id")long id) {
	  userService.deleteUser(id);
	}
	
	@PutMapping("/updateuser/{id}")
	public UserEntity updateUser(@PathVariable("id") long id ,@RequestBody UserEntity userEntity ) {
		return userService.updateUser(id, userEntity);
		
	}
	
}
