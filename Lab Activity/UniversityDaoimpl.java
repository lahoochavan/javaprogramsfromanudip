package com.onetomanymumbaiuniver.daoimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.onetomanymumbaiuniver.config.Hibernateutil;
import com.onetomanymumbaiuniver.dao.UniversityDao;
import com.onetomanymumbaiuniver.entity.Student;
import com.onetomanymumbaiuniver.entity.University;

public class UniversityDaoimpl implements UniversityDao {

	Session session = Hibernateutil.getSessionFactory().openSession();
	Transaction t = session.beginTransaction();

	@SuppressWarnings("deprecation")
	public void adduniversity() {
		University u = new University();
		u.setUid(12);
		u.setUname("mumbai");
		u.setUlocation("santacruz");
		u.setUemail("mu88mumbaiuniversity@gmail.com");

		Student e = new Student();
		e.setSid(125);
		e.setSname("mitesh");
		e.setSclass("first year");
		e.setGender("male");
		e.setSphone(723789882);
		e.setSstream("instrumental");
		e.setAaddress("badlapur,galanagar");

		Student e1 = new Student();
		e1.setSid(126);
		e1.setSname("ravi");
		e1.setSclass("second year");
		e1.setGender("male");
		e1.setSphone(72378975);
		e1.setSstream("chemical");
		e1.setAaddress("ghatkopar,pantnagar");

		Student e2 = new Student();
		e2.setSid(127);
		e2.setSname("priya");
		e2.setSclass("fourth year");
		e2.setGender("female");
		e2.setSphone(723782155);
		e2.setSstream("computer science");
		e2.setAaddress("vidyavihar,phonexmall");

		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(e);
		a1.add(e1);
		a1.add(e2);

		u.setStudent(a1);
		session.save(u);
		t.commit();
		System.out.println(" inserted sucessfully");

	}

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public void fetchuniversity() {
		@SuppressWarnings("deprecation")
		Query q = session.createQuery(" from University  ");
		List<University> a1 = q.getResultList();

		Iterator<University> itr = a1.iterator();
		while (itr.hasNext()) {
			University c1 = itr.next();
			List<Student> a11 = c1.getStudent();
			System.out.println(c1.getUid() + " " + c1.getUemail() + " " + c1.getUlocation() + " " + c1.getUname() + " "
					+ c1.getClass() + " " + c1.getStudent());

		}

	}
}
