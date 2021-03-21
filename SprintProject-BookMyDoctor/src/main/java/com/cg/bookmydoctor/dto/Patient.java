package com.cg.bookmydoctor.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Patient implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int patientId;
private String patientName;
private long mobileNo;
private String email;
private String password;
private String bloodGroup;
private String gender;
private int age;
private String address;

@ManyToOne
@JoinColumn(name="DoctorID",nullable = false)
private Doctor doctor;

public Patient() {
	
}

public Patient(String patientName, long mobileNo, String email, String password, String bloodGroup,
		String gender, int age, String address,Doctor doctor) {
	super();
	
	this.patientName = patientName;
	this.mobileNo = mobileNo;
	this.email = email;
	this.password = password;
	this.bloodGroup = bloodGroup;
	this.gender = gender;
	this.age = age;
	this.address = address;
	this.doctor=doctor;
}




public int getPatientId() {
	return patientId;
}



public String getPatientName() {
	return patientName;
}

public void setPatientName(String patientName) {
	this.patientName = patientName;
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

public String getBloodGroup() {
	return bloodGroup;
}

public void setBloodGroup(String bloodGroup) {
	this.bloodGroup = bloodGroup;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Doctor getDoctor() {
	return doctor;
}

public void setDoctor(Doctor doctor) {
	this.doctor = doctor;
}




}
