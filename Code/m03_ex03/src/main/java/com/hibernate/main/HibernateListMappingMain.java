package com.hibernate.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.model.Employee;
import com.hibernate.util.HibernateUtil;

public class HibernateListMappingMain {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setName("Steve");
		emp.setRole("Trainer");
		emp.setInsert_time(new Date());

		List<String> phoneNumbers = new ArrayList<>();
		phoneNumbers.add("1484455");
		phoneNumbers.add("55555877");
		phoneNumbers.add("2424545");
		emp.setPhoneNumbers(phoneNumbers);

		// Get Session
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		// Start transaction
		session.beginTransaction();

		// Save the model object
		session.save(emp);

		Query query = session.createQuery("from Employee");
		List<Employee> list = query.list();

		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			Employee employee = itr.next();
			System.out.println("Employee Name: " + employee.getName());

			// Printing phone numbers
			List<String> lst = employee.getPhoneNumbers();
			Iterator<String> itr2 = lst.iterator();
			while (itr2.hasNext()) {
				System.out.println(itr2.next());
			}
		}
		System.out.println("Phone Numbers retrieved sucessfully!");
		// Commit transaction
		session.getTransaction().commit();

		// terminate session factory; otherwise program won't end
		HibernateUtil.getSessionFactory().close();

	}

}
