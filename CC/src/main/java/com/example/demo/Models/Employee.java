package com.example.demo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "gender")
	private String gender;
	
	@Column(name = "numberofrooms")
	private String numberofrooms;	
	
	@Column(name = "img")
	private String img;
	
	public Employee() {
		super();
	}

	public Employee(long id, String name, String gender, String numberofrooms, String img) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.numberofrooms = numberofrooms;
		this.img = img;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNumberofrooms() {
		return numberofrooms;
	}

	public void setNumberofrooms(String numberofrooms) {
		this.numberofrooms = numberofrooms;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	
}