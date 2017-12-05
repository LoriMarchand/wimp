package com.lmig.gfc.wimp.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Actor {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;	
		
	@Column(length = 75, nullable = false)
	private String firstName;
		
	@Column(nullable = true)
	private String lastName;
		
	@Column(nullable = true)
	private Long activeSinceYear;
		
	@Column(nullable = true)
	private Date birthDate; 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getActiveSinceLastYear() {
		return activeSinceYear;
	}

	public void setActiveSinceLastYear(Long activeSinceYear) {
		this.activeSinceYear = activeSinceYear;
	}
}
