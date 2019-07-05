package com.learning.orm.ud.one2one;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learning.orm.util.SessionUtil;

public class Runner {

	public static void main(String[] args) {

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

	}

}
