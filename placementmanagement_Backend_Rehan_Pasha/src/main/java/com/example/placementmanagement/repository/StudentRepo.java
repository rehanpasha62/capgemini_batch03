package com.example.placementmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.placementmanagement.entity.StudentEntity;

public interface StudentRepo  extends CrudRepository<StudentEntity, Integer>{

}
