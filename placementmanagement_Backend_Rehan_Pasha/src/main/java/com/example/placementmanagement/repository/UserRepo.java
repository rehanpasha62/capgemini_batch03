package com.example.placementmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.placementmanagement.entity.UserEntity;

public interface UserRepo extends CrudRepository<UserEntity, Long> {

}
