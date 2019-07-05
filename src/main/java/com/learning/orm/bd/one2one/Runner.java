package com.learning.orm.bd.one2one;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.learning.orm.bd.one2one.Userdetail;

import com.learning.orm.util.SessionUtil;

public class Runner {
	
	
	public static void main(String[] args) {
		
		Userdetail user = new Userdetail();
		user.setUserName("Nikhil");
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("WagonR");
		
		user.setVehicle(vehicle);
		vehicle.setUser(user);
		
		
		Session session = SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();

		session.save(user);
		session.save(vehicle);

		transaction.commit();
		session.close();

		
	}

}
