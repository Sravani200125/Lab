package com.cg.bookmydoctor.service;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.cg.bookmydoctor.dao.IPatientDao;
import com.cg.bookmydoctor.dao.PatientRepository;
import com.cg.bookmydoctor.dto.Doctor;
import com.cg.bookmydoctor.dto.Patient;

@Service
public class IPatientServiceImpl implements IPatientService{
	
	@Autowired
	PatientRepository pdao;

	@Override
	public Patient addPatient(Patient bean) {
		pdao.saveAndFlush(bean);
		System.out.println("Given Details of the patient are added!!!!!");
	    return bean;
	}

	@Override
	public Patient editPatientProfile(Patient bean) {
		pdao.saveAndFlush(bean);
		return bean;
	}

	@Override
	public Patient removePatientDetails(Patient bean) {
		pdao.delete(bean);
		return bean;
	}

	@Override
	public Patient getPatient(String name) {
		return pdao.findByPatientName(name);
	}

	@Override
	public List<Patient> getAllPatient() {
		return pdao.getAllPatient();
	}

	@Override
	public List<Patient> getPatientListByDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient> getPatientListByDate(LocalDate appdate) {
		// TODO Auto-generated method stub
		return null;
	}

}
