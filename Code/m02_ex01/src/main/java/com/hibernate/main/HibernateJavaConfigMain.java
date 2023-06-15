package com.hibernate.main;

import java.util.Date;

import org.hibernate.Session;

import com.hibernate.model.Employee1;
import com.hibernate.util.HibernateUtil;

public class HibernateJavaConfigMain {

	public static void main(String[] args) {
		Employee1 emp = new Employee1();

		emp.setName("Lisa");
		emp.setRole("Manager");
		emp.setInsert_time(new Date());

		// Get Session
		Session session = HibernateUtil.getSessionJavaConfigFactory().getCurrentSession();

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
