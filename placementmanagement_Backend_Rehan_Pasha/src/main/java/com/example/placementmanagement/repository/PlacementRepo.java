package com.example.placementmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.placementmanagement.entity.PlacementEntity;

public interface PlacementRepo  extends CrudRepository<PlacementEntity, Long>{

}
