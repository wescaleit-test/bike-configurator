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

import com.javahelps.restservice.entity.TblBOMHeaderData;
import com.javahelps.restservice.repository.BOMHeaderDataRepository;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/bomHeader")
public class BOMHeaderDataController {
	
	@Autowired
	private BOMHeaderDataRepository repository;

	@GetMapping
	public Iterable<TblBOMHeaderData> findAll() {
		return repository.findAll();
	}

	@GetMapping(path = "/{bomId}")
	public TblBOMHeaderData find(@PathVariable("bomId") String bomId) {
		return repository.findOne(bomId);
	}

	@PostMapping(consumes = "application/json")
	public TblBOMHeaderData create(@RequestBody TblBOMHeaderData bomId) {
		return repository.save(bomId);
	}

	@DeleteMapping(path = "/{bomId}")
	public void delete(@PathVariable("bomId") String bomId) {
		repository.delete(bomId);
	}

	@PutMapping(path = "/{bomId}")
	public TblBOMHeaderData update(@PathVariable("bomId") int bomId, @RequestBody TblBOMHeaderData oTblBOMHeaderData) throws BadHttpRequest {
		if (repository.exists(Integer.toString(bomId))) {
			oTblBOMHeaderData.setBomId(bomId);
			return repository.save(oTblBOMHeaderData);
		} else {
			throw new BadHttpRequest();
		}
	}

}
