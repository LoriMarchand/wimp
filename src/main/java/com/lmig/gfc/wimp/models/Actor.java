package com.lmig.gfc.wimp.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Actor {

	public Actor() {}
	
	public Actor(String firstName, String lastName, Long activeSinceYear, Date birthDate) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.activeSinceYear = activeSinceYear;
		this.birthDate = birthDate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	// The side that DOES NOT OWN the Relationship gets the Mapped By!!!
	@JsonIgnore
	@ManyToMany(mappedBy = "actors")
	private List<Movie> movies;

	@OneToMany(mappedBy = "actor")
	private List<Awards> awards;

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
