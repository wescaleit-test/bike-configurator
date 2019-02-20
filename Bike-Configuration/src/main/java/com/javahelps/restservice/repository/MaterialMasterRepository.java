package com.javahelps.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.javahelps.restservice.entity.tbl_master_material;

@RepositoryRestResource(path = "/MaterialMaster")
public interface MaterialMasterRepository extends JpaRepository<tbl_master_material, String> {
}