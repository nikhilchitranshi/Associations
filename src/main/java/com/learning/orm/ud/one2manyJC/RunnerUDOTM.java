package com.learning.orm.ud.one2manyJC;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learning.orm.util.SessionUtil;

public class RunnerUDOTM {
	
	public static void main(String[] args) {
		
		Book book = new Book();
		book.setBookName("Beginning Hibernate");
		
		Author kormen = new Author();
		kormen.setAuthorName("Kormen");
		kormen.setBookId(1);
		
		Author linz = new Author();
		linz.setAuthorName("Linz");
		kormen.setBookId(1);
		
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
