package com.example.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {

	@Id
	@Column(name = "doctorId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctorId;
	@Column(name = "name")
	private String name;
	@Column(name = "photo")
	private String phone;
	@Lob
	@Column(name = "photo")
	private Byte[] photo;
	@Column(name = "bio")
	private String bio;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "doctorId")
	private List<Visit> visits;

	public Doctor() {

	}

	public Doctor(String name, String phone, Byte[] photo, String bio, List<Visit> visits) {
		this.name = name;
		this.phone = phone;
		this.photo = photo;
		this.bio = bio;
		this.visits = visits;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(Byte[] photo) {
		this.photo = photo;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public List<Visit> getVisits() {
		return visits;
	}

	public void setVisits(List<Visit> visits) {
		this.visits = visits;
	}

}
