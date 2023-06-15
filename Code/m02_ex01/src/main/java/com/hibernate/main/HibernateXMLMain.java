package com.hibernate.main;

import java.util.Date;

import org.hibernate.Session;

import com.hibernate.model.Employee;
import com.hibernate.util.HibernateUtil;

public class HibernateXMLMain {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Steve");
		emp.setRole("Trainer");
		emp.setInsert_time(new Date());

		// Get Session
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		// Start transaction
		session.beginTransaction();

		// Save the model object
		session.save(emp);

		// Commit transaction
		session.getTransaction().commit();

		System.out.println("Employee ID = " + emp.getId());
		
		// terminate session factory; otherwise program won't end
		HibernateUtil.getSessionFactory().close();
	}

}