package com.project.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.model.Pib;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/project")
public class Controller {

	@Autowired
	com.project.demo.service.PibService pibService;
	
	@GetMapping("/insertar/{pibId}/{year}/{percent}")
	public void insertPib(@PathVariable int pibId,
			@PathVariable int year,
			@PathVariable double percent) {
		pibService.insert(pibId, year, percent);
	}
	
	@GetMapping("/getAllPibs")
	public List<Pib> getAllPibs(){
		return pibService.getAllPibs();
	}
	
	@GetMapping("/delete/{pibId}")
	public void delete(@PathVariable int pibId) {
		pibService.delete(pibId);
	}

	
	
	
}
