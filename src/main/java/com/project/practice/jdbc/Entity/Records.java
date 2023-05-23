package com.project.practice.jdbc.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="records")
public class Records {
	
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator = "auto")
	@Column(name="id")
	private Long id;
	
	
	@Column(name="encounter")
	private String encounter;
	
	@OneToMany
	private List<Doctor> doctor;
	
	@ManyToOne
	@Column(nullable =false)
	private History history;

}
