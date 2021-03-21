package com.cg.bookmydoctor.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Doctor {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int doctorId;
	private String doctorName;
	private String speciality;
	private String location;
	private String hospitalName;
	private long mobileNo;
	private String email;
	private String password;
	private double chargesPerVisit;
	
	@OneToMany(mappedBy="doctor",cascade=CascadeType.ALL)
	private List<Patient> patientList;
	
	public Doctor() {
		
	}
	
	public Doctor( String doctorName, String speciality, String location, String hospitalName,
			long mobileNo, String email, String password, double chargesPerVisit) {
		super();
		
		this.doctorName = doctorName;
		this.speciality = speciality;
		this.location = location;
		this.hospitalName = hospitalName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.password = password;
		this.chargesPerVisit = chargesPerVisit;
		
	}

	public int getDoctorId() {
		return doctorId;
	}

	

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getChargesPerVisit() {
		return chargesPerVisit;
	}

	public void setChargesPerVisit(double chargesPerVisit) {
		this.chargesPerVisit = chargesPerVisit;
	}

	
	
	
	
	
}
