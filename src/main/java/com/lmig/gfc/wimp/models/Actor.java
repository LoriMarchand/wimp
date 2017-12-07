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
	private Long id;	
		
	@Column(length = 75, nullable = false)
	private String firstName;
		
	@Column(nullable = true)
	private String lastName;
		
	@Column(nullable = true)
	private Long activeSinceYear;
		
	@Column(nullable = true)
	private Date birthDate; 
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public void setActiveSinceYear(Long activeSinceYear) {
		this.activeSinceYear = activeSinceYear;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Long getActiveSinceYear() {
		return activeSinceYear;
	}

	public void setActiveSinceLastYear(Long activeSinceYear) {
		this.activeSinceYear = activeSinceYear;
	}
}

