package com.learning.orm.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
	
	private static final SessionUtil instance = new SessionUtil();
    private final SessionFactory factory;
    private static final String CONFIG_NAME = "/configuration.properties";

    private SessionUtil() {
        factory = new Configuration().configure().buildSessionFactory();
    }

    public static Session getSession() {
        return getInstance().factory.openSession();
    }

    private static SessionUtil getInstance() {
        return instance;
    }
	

}
