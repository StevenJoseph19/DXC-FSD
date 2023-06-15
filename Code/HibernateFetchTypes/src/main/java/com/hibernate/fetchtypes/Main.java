package com.hibernate.fetchtypes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.fetchtypes.model.Books;
import com.hibernate.fetchtypes.model.Subject;
import com.hibernate.fetchtypes.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		save(factory);
		retrieve(factory);

	}

	private static void retrieve(SessionFactory factory) {
		Session session = factory.openSession();
		try {
			session.getTransaction().begin();
			Subject subject = (Subject) session.get(Subject.class, 1);
			System.out.println("subject associated collection is loading lazily as @OneToMany is lazy loaded");
//			System.out.println("subject associated collection is loading eagerly as Fetch Type is set to EAGER");

			Books books = (Books) session.get(Books.class, 1);
			System.out.println(
					"books associated collection is loading eagerly as by default @ManyToOne is Eagerly loaded");
			/*
			 * Books b1=(Books)session.get(Books.class, new Integer(1));
			 * 
			 * Subject sub=session.get(Subject.class, 1); sub.getListBooks().remove(b1);
			 * session.save(sub); session.getTransaction().commit();
			 */
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	private static void save(SessionFactory factory) {
		Subject subject = new Subject();
		subject.setName("C++");

		Books books = new Books();
		books.setAuthorName("Bala");
		books.setName("C++ Book");
		books.setSubject(subject);

		subject.getListBooks().add(books);
		Session session = factory.openSession();
		try {
			session.beginTransaction();

			session.save(subject);

			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}