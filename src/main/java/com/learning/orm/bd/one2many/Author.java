package com.learning.orm.bd.one2many;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHOR_BD_O2M")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String authorName;

	@ManyToOne
	@JoinColumn(name="book_id")
	private Book book;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	


}
