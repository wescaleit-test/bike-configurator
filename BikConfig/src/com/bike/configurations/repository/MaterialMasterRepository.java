package com.bike.configurations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bike.configurations.entity.tbl_master_material;

@RepositoryRestResource(path = "/MaterialMaster")
public interface MaterialMasterRepository extends JpaRepository<tbl_master_material, String> {
}