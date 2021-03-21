package com.cg.bookmydoctor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookmydoctor.dto.Patient;
import com.cg.bookmydoctor.service.IPatientService;

@RestController
@RequestMapping("/patient")
public class MyController {
	
	@Autowired
	IPatientService pservice;
	
	@GetMapping
	public List<Patient> getPatientList(){
		return pservice.getAllPatient();
	}
	
	@PostMapping
	public Patient addPatient(@RequestBody Patient bean) {
		return pservice.addPatient(bean);
		
	}
	
	@GetMapping("/pname/{name}")
	public Patient getPatientByName(@PathVariable String name) {
		return pservice.getPatient(name);
	}
	
	@DeleteMapping
	public Patient removePatient(@RequestBody Patient p) {
		return pservice.removePatientDetails(p);
		
	}
	
	@PutMapping
	public Patient updatePatient(@RequestBody Patient p) {
		return pservice.editPatientProfile(p);
	}

}
