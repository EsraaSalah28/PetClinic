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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clinic")
public class Clinic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "clinicId")
	private int clinicId;
	@Column(name = "name")
	private String name;
	@Column(name = "address")
	private String address;
	@Column(name = "phone")
	private String phone;
	@Column(name = "workingdays")
	private String workingdays;
	@Column(name = "email")
	private String email;
	@Column(name = "url")
	private String url;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "clinicId")
	private List<Visit> vities;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "clinicId")
	private List<Doctor> doctors;

	public Clinic() {

	}

	public Clinic(String name, String address, String phone, String workingdays, String email, String url,
			List<Visit> vities, List<Doctor> doctors) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.workingdays = workingdays;
		this.email = email;
		this.url = url;
		this.vities = vities;
		this.doctors = doctors;
	}

	public int getClinicId() {
		return clinicId;
	}

	public void setClinicId(int clinicId) {
		this.clinicId = clinicId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWorkingdays() {
		return workingdays;
	}

	public void setWorkingdays(String workingdays) {
		this.workingdays = workingdays;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Visit> getVities() {
		return vities;
	}

	public void setVities(List<Visit> vities) {
		this.vities = vities;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	@Override
	public String toString() {
		return "Clinic [clinicId=" + clinicId + ", name=" + name + ", address=" + address + ", phone=" + phone
				+ ", workingdays=" + workingdays + ", email=" + email + ", url=" + url + ", vities=" + vities
				+ ", doctors=" + doctors + "]";
	}

}
