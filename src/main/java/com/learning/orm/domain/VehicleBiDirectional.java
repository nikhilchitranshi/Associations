package com.learning.orm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class VehicleBiDirectional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String vehicleName;
	
	@ManyToOne
	private UserDetailsOneToManyBiDirectional userDetails;

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

	public UserDetailsOneToManyBiDirectional getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetailsOneToManyBiDirectional userDetails) {
		this.userDetails = userDetails;
	}
	
	

}
