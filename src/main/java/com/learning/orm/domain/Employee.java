package com.learning.orm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.TableGenerator;

@Entity
@SecondaryTables({ 
					@SecondaryTable(name = "EmployeeAddress", pkJoinColumns = {
												@PrimaryKeyJoinColumn(name = "addressId", referencedColumnName = "addrId") 
																			}) 
					})
public class Employee {

	@Id
	private long id;

	private String name;
	
	private int addrId;

	@Column(table="EmployeeAddress")
	private String address;

	public Employee() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}
	
	

}
