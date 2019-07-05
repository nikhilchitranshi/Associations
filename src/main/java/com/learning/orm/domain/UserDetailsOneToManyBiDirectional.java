package com.learning.orm.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserDetailsOneToManyBiDirectional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;
	
	@OneToMany
	private Collection<VehicleBiDirectional> vehlicles = new ArrayList<VehicleBiDirectional>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Collection<VehicleBiDirectional> getVehlicles() {
		return vehlicles;
	}

	public void setVehlicles(Collection<VehicleBiDirectional> vehlicles) {
		this.vehlicles = vehlicles;
	}
	
	

}
