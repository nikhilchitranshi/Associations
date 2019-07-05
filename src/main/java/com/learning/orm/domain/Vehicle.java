package com.learning.orm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String vehicleName;
	
	@ManyToOne
	private UserDetailsOneToMany user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public UserDetailsOneToMany getUser() {
		return user;
	}

	public void setUser(UserDetailsOneToMany user) {
		this.user = user;
	}
	
	

}
