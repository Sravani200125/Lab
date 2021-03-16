package org.capg.demo.controller;

import java.util.List;
import java.util.Optional;

import org.capg.demo.bean.Trainee;
import org.capg.demo.service.TraineeJpaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Trainee")
public class TraineeController {
	@Autowired
	TraineeJpaService jpaService;
	
	@GetMapping("/all")
	public List<Trainee> getTraineeList(){
		return jpaService.getAllTrainee();
	}
	
	@PostMapping
	public List<Trainee> insertTrainee(@RequestBody Trainee t){
		return jpaService.addTrainee(t);
		
	}
	
	@GetMapping(value="/id/{id}")
	public Optional<Trainee> getTrainee(@PathVariable int id) {
		
			return jpaService.getTrainee(id);
	}
	
	@DeleteMapping(value="/{tid}")
	public List<Trainee> deleteTrainee(@PathVariable int tid){
		return jpaService.removeTrainee(tid);
		
	}
	
	@PutMapping
	public List<Trainee> updateTrainee(@RequestBody Trainee t){
		return jpaService.updateTrainee(t);
		
	}
	
	@GetMapping(value="/name/{name}")
	public List<Trainee> getByName(@PathVariable String name){
		return jpaService.findTraineebyName(name);
	}
}
