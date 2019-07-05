package com.learning.orm.batch;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.OneToOne;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learning.orm.domain.Author;
import com.learning.orm.domain.Book;
import com.learning.orm.domain.BookID;
import com.learning.orm.domain.Employee;
import com.learning.orm.domain.EmployeeAddress;
import com.learning.orm.domain.Student;
import com.learning.orm.domain.UserDetails;
import com.learning.orm.domain.UserDetailsOneToMany;
import com.learning.orm.domain.UserDetailsOneToManyBiDirectional;
import com.learning.orm.domain.Vehicle;
import com.learning.orm.domain.VehicleBiDirectional;
import com.learning.orm.util.SessionUtil;

public class Runner {
	
	public static void main(String[] args) {
		
//		Book book = new Book();		
//		
//		book.setName("My Hibernate Book");
//		book.setTitle("Beginning Hibernate");
//		book.setPages(236);
//		
//		Set<Author> authors = new HashSet<Author>();
//		Author author = new Author();
//		author.setName("Nikhil");
//		//author.setBookId(1);
//		authors.add(author);
//		
//		book.setAuthors(authors);
//	
//		
//		Session session = SessionUtil.getSession();
//		Transaction transaction = session.beginTransaction();
//		
//		session.save(author);
//		session.save(book);
//		
//		
//		book = session.load(Book.class, 1L);
//		
//		System.out.println(book);
//		
//		transaction.commit();
//		session.close();
		
		//oneToOne();
		//oneToMany();		
		oneToManyBD();
		System.exit(0);
		
		
	}
	
	

	public static void oneToOne() {
		
		UserDetails userdetails = new UserDetails();
		
		userdetails.setUserName("Kumar Nikhil Chitranshi");
		
		Vehicle car = new Vehicle();
		car.setVehicleName("WagonR");
		
		userdetails.setVehicle(car);
		
		
		Session session = SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(userdetails);
		session.save(car);
		
		transaction.commit();
		session.close();
		
		
		
		Session session1 = SessionUtil.getSession();
		Transaction transaction1 = session1.beginTransaction();
		
		UserDetails user = session1.load(UserDetails.class, 1);
		System.out.println(user);
		
		transaction1.commit();
		session1.close();		
	}
	
	private static void oneToMany() {
		
		UserDetailsOneToMany userdetails = new UserDetailsOneToMany();
		
		userdetails.setUserName("Kumar Nikhil Chitranshi");
		
		Vehicle car = new Vehicle();
		car.setVehicleName("WagonR");
		
		Vehicle jeep = new Vehicle();
		jeep.setVehicleName("Jeep");
		
		userdetails.getVehicles().add(car);
		userdetails.getVehicles().add(jeep);
		car.setUser(userdetails);
		jeep.setUser(userdetails);
		
		Session session = SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		
		
		session.save(car);
		session.save(jeep);
		session.save(userdetails);
		
		transaction.commit();
		session.close();
		
	}
	
	
	private static void oneToManyBD() {
		
		UserDetailsOneToManyBiDirectional userdetails = new UserDetailsOneToManyBiDirectional();
		
		userdetails.setUserName("Kumar Nikhil Chitranshi");
		
		VehicleBiDirectional car = new VehicleBiDirectional();
		car.setVehicleName("WagonR");
		car.setUserDetails(userdetails);
		
		VehicleBiDirectional jeep = new VehicleBiDirectional();
		jeep.setVehicleName("Jeep");
		jeep.setUserDetails(userdetails);
		
		userdetails.getVehlicles().add(car);
		userdetails.getVehlicles().add(jeep);
		
		
		Session session = SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		
		
		session.save(car);
		session.save(jeep);
		session.save(userdetails);
		
		transaction.commit();
		session.close();
		
	}

}
