package com.javahelps.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.javahelps.restservice.entity.TblBOMHeaderData;


//@RepositoryRestResource(path = "/bomType")
public interface BOMHeaderDataRepository extends JpaRepository<TblBOMHeaderData, String> {
}