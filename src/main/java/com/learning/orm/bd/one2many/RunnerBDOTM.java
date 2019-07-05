package com.learning.orm.bd.one2many;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learning.orm.util.SessionUtil;

public class RunnerBDOTM {
	
	public static void main(String[] args) {
		
		Book book = new Book();
		book.setBookName("Beginning Hibernate");
		
		Author kormen = new Author();
		kormen.setAuthorName("Kormen");
		
		Author linz = new Author();
		linz.setAuthorName("Linz");
		
		book.getAuthors().add(kormen);
		book.getAuthors().add(linz);
		
		
		Session session = SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();

		session.save(book);
		session.save(linz);
		session.save(kormen);
		

		transaction.commit();
		session.close();
		
		
		
		
	}

}
