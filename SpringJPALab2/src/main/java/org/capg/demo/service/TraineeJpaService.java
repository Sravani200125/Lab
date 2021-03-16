package org.capg.demo.service;

import java.util.List;
import java.util.Optional;

import org.capg.demo.bean.Trainee;

public interface TraineeJpaService {
	public List<Trainee> getAllTrainee();
	public List<Trainee> addTrainee(Trainee t);
	public Optional<Trainee> getTrainee(int id);
	public List<Trainee> removeTrainee(int id);
	public List<Trainee> updateTrainee(Trainee t);
	public List<Trainee> findTraineebyName(String name);

}
