package com.example.placementmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.placementmanagement.entity.AdminEntity;

public interface AdminRepo extends CrudRepository<AdminEntity, Long> {

}
