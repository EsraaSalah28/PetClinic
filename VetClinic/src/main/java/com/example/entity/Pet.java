package com.example.entity;

import java.util.Arrays;
import java.util.Date;
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
@Table(name = "pet")

public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "petId")
	private int petId;
	@Column(name = "name")
	private String name;
	@Column(name = "gender")
	private Character gender;
	@Column(name = "date")
	private Date date;
	@Column(name = "animalKind")
	private String animalKind;
	@Column(name = "photo")
	private byte[] photo;
	@Column(name = "weight")
	private int weight;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "petId")
	private List<Visit> visits;

	public Pet() {

	}

	public Pet(String name, Character gender, Date date, String animalKind, byte[] photo, int weight,
			List<Visit> visits) {
		this.name = name;
		this.gender = gender;
		this.date = date;
		this.animalKind = animalKind;
		this.photo = photo;
		this.weight = weight;
		this.visits = visits;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAnimalKind() {
		return animalKind;
	}

	public void setAnimalKind(String animalKind) {
		this.animalKind = animalKind;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public List<Visit> getVisits() {
		return visits;
	}

	public void setVisits(List<Visit> visits) {
		this.visits = visits;
	}

	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", name=" + name + ", gender=" + gender + ", date=" + date + ", animalKind="
				+ animalKind + ", photo=" + Arrays.toString(photo) + ", weight=" + weight + ", visits=" + visits + "]";
	}

}
