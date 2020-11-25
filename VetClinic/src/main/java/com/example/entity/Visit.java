package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "visit")
public class Visit {

	@Id
	@Column(name = "visitId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int visitId;
	private Pet pet;
	private Doctor doctor;
	private Clinic clinic;
	@Column(name = "date")
	private Date date;

	public Visit() {
	}

	public Visit(Pet pet, Doctor doctor, Clinic clinic, Date date) {
		super();
		this.pet = pet;
		this.doctor = doctor;
		this.clinic = clinic;
		this.date = date;
	}

	public int getVisitId() {
		return visitId;
	}

	public void setVisitId(int visitId) {
		this.visitId = visitId;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Clinic getClinic() {
		return clinic;
	}

	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Visit [visitId=" + visitId + ", pet=" + pet + ", doctor=" + doctor + ", clinic=" + clinic + ", date="
				+ date + "]";
	}

}
