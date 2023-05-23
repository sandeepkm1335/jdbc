package com.project.practice.jdbc.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="history")
public class History {
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@OneToOne
	@JoinColumn
	@Column(nullable = false)
	private Person person;
	
	@OneToMany
	private Doctor doctor;

}
