package com.hibernate.mapping.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.hibernate.mapping.model.Category;
import com.hibernate.mapping.model.Stock;
import com.hibernate.mapping.util.HibernateUtil;

/**
 * A program that demonstrates using Hibernate framework to manage a
 * bidirectional many-to-many association in relational database.
 *
 */
public class InventoryManager {
	public static void main(String[] args) {

		System.out.println("Hibernate many to many (XML Mapping)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Stock stock = new Stock();
		stock.setStockCode("7052");
		stock.setStockName("PADINI");

		Category category1 = new Category("CONSUMER", "CONSUMER COMPANY");
		Category category2 = new Category("INVESTMENT", "INVESTMENT COMPANY");

		Set<Category> categories = new HashSet<Category>();
		categories.add(category1);
		categories.add(category2);

		stock.setCategories(categories);

		session.save(stock);

		session.getTransaction().commit();
		// terminate session factory, otherwise program won't end
		HibernateUtil.getSessionFactory().close();

		System.out.println("Done");
	}
}