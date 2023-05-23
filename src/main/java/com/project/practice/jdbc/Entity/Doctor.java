package com.project.practice.jdbc.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="doctor")
public class Doctor {
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator = "auto")
	@Column(name="id")
	private Long id;
	
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="specialization")
	private String specialization;
	
	@Column(name="availability")
	private Boolean availability;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<Person> person;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getSpecialization() {
		return specialization;
	}

	public Boolean getAvailability() {
		return availability;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}
	
	
}
