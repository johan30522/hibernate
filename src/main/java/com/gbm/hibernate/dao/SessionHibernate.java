package com.gbm.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionHibernate {
	private Session session;
	public SessionHibernate() {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		session.beginTransaction();
	}
	public Session getSession() {
		return session;
	}
}
