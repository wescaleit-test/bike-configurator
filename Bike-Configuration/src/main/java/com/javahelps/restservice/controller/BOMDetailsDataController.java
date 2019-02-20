package com.javahelps.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javahelps.restservice.entity.TblBOMDetailsData;
import com.javahelps.restservice.repository.BOMDetailsDataRepository;

import javassist.tools.web.BadHttpRequest;
@RestController
@RequestMapping(path = "/bomDetails")
public class BOMDetailsDataController {
	
	@Autowired
	private BOMDetailsDataRepository repository;

	@GetMapping
	public Iterable<TblBOMDetailsData> findAll() {
		return repository.findAll();
	}

	@GetMapping(path = "/{detailId}")
	public TblBOMDetailsData find(@PathVariable("detailId") String detailId) {
		return repository.findOne(detailId);
	}

	@PostMapping(consumes = "application/json")
	public TblBOMDetailsData create(@RequestBody TblBOMDetailsData bomDetailId) {
		return repository.save(bomDetailId);
	}

	@DeleteMapping(path = "/{detailId}")
	public void delete(@PathVariable("detailId") String detailId) {
		repository.delete(detailId);
	}

	@PutMapping(path = "/{detailId}")
	public TblBOMDetailsData update(@PathVariable("detailId") int detailId, @RequestBody TblBOMDetailsData oTblBOMDetailsData) throws BadHttpRequest {
		if (repository.exists(Integer.toString(detailId))) {
			oTblBOMDetailsData.setBomId(detailId);
			return repository.save(oTblBOMDetailsData);
		} else {
			throw new BadHttpRequest();
		}
	}

}
