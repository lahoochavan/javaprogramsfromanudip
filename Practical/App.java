package com.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import maven.com.Entity.Empolyee;

public class App

{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Empolyee e = new Empolyee();
		e.setEname("lahoo");
		e.setEadd("ghatkopar");
		e.setEphone(9454158425L);
		e.setEsalary(52222);
		s.save(e);
		Transaction t = s.beginTransaction();
		t.commit();
		System.out.println("all is done");

		sf.close();
		s.close();

	}
}
