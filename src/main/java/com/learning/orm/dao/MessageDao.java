package com.learning.orm.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learning.orm.domain.Message;
import com.learning.orm.util.SessionUtil;

public class MessageDao {
	
	public void saveMessage(Message msg) {
		
		Session session = SessionUtil.getSession();
        Transaction tx = session.beginTransaction();
        
        session.save(msg);
        
        tx.commit();
        session.close();
		
	}

}
