package com.bike.configurations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bike.configurations.entity.TblBOMDetailsData;

public interface BOMDetailsDataRepository extends JpaRepository<TblBOMDetailsData, String> {
}