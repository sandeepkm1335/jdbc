package com.project.practice.jdbc.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="person")

public class Person implements Serializable{
	@Id
//	@GenericGenerator(name="auto",strategy="increment")
//	@GeneratedValue(generator = "auto")
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="email")
	private String email;
	
	@Column(name="phNo")
	private String phNo;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="adress")
	private String adress;
	
	
	@ManyToMany
	@JoinColumn
	private List<Doctor> doctor;
	
	@OneToOne(mappedBy = "person")
	private  History history;
	
	@OneToOne
	private Records records;

	
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhNo() {
		return phNo;
	}

	public String getGender() {
		return gender;
	}

	public Integer getAge() {
		return age;
	}

	public String getAdress() {
		return adress;
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

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	

}
