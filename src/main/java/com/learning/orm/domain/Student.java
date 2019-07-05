package com.learning.orm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Student {

	
	@Id
	@TableGenerator(name="table_gen", table="ID_TABLE", pkColumnName = "ID", pkColumnValue = "NEXT_STUDENT_ID")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table_gen")
	private long id;
	
	private String name;
	
	
	public Student() {}


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
	
	
	
	



}
