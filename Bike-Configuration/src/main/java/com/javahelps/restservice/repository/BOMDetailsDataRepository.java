package com.javahelps.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javahelps.restservice.entity.TblBOMDetailsData;

public interface BOMDetailsDataRepository  extends JpaRepository<TblBOMDetailsData, String>{	
}
