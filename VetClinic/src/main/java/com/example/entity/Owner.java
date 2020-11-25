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
@Table(name = "owner")
public class Owner {

	@Id
	@Column(name = "ownerId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ownerId;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private String phone;
	@Column(name = "gender")
	private Character gender;
	@Column(name = "address")
	private String address;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "ownerId")
	private List<Pet> pets;

	public Owner() {

	}

	public Owner(String name, String email, String phone, Character gender, String address, List<Pet> pets) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.address = address;
		this.pets = pets;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	@Override
	public String toString() {
		return "Owner [ownerId=" + ownerId + ", name=" + name + ", email=" + email + ", phone=" + phone + ", gender="
				+ gender + ", address=" + address + ", pets=" + pets + "]";
	}

}
