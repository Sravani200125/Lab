package com.cg.bookmydoctor.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookmydoctor.dto.Patient;

public interface PatientRepository extends IPatientDao,JpaRepository<Patient, Integer>{
	public Patient findByPatientName(String name);

}
