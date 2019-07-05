package com.learning.orm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	//private int bookId;

	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public int getBookId() {
//		return bookId;
//	}
//
//	public void setBookId(int bookId) {
//		this.bookId = bookId;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
