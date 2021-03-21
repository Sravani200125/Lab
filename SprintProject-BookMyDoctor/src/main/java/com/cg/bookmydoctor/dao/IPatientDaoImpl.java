package com.cg.bookmydoctor.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.bookmydoctor.dto.Doctor;
import com.cg.bookmydoctor.dto.Patient;


@Repository
@Transactional
public class IPatientDaoImpl implements IPatientDao {
	
	@PersistenceContext
	EntityManager em;

	
	

	@Override
	public List<Patient> getAllPatient() {
		TypedQuery<Patient> q=em.createQuery("select p from Patient p",Patient.class);
		return q.getResultList();
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
