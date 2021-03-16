package org.capg.demo.service;

import java.util.List;
import java.util.Optional;

import org.capg.demo.bean.Trainee;
import org.capg.demo.dao.TraineeDaoJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("jpaService")
public class TraineeServiceImpl implements TraineeJpaService {
	@Autowired
	TraineeDaoJpa tdao;

	@Override
	public List<Trainee> getAllTrainee() {
		
		return tdao.findAll();
	}

	@Override
	public List<Trainee> addTrainee(Trainee t) {
		tdao.saveAndFlush(t);
		return tdao.findAll();
	}

	@Override
	public Optional<Trainee> getTrainee(int id) {
	    return tdao.findById(id);
	}

	@Override
	public List<Trainee> removeTrainee(int id) {
		tdao.deleteById(id);
		return tdao.findAll();
		
		
	}

	@Override
	public List<Trainee> updateTrainee(Trainee t) {
		tdao.saveAndFlush(t);
		return tdao.findAll();
	}

	@Override
	public List<Trainee> findTraineebyName(String name) {
		
		return tdao.findByTraineeName(name);
	}
	

}
