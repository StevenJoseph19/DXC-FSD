package com.hibernate.mapping.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.hibernate.mapping.model.Category;
import com.hibernate.mapping.model.Product;
import com.hibernate.mapping.util.HibernateUtil;

/**
 * This program demonstrates using Hibernate framework to manage a bidirectional
 * one-to-many association.
 *
 */
public class StockManager {

	public static void main(String[] args) {
		// loads configuration and mappings
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		Category category = new Category("Computer");

		Product pc = new Product("DELL PC", "Quad-core PC", 1200, category);

		Product laptop = new Product("MacBook", "Apple High-end laptop", 2100, category);

		Product phone = new Product("iPhone 5", "Apple Best-selling smartphone", 499, category);

		Product tablet = new Product("iPad 3", "Apple Best-selling tablet", 1099, category);

		Set<Product> products = new HashSet<Product>();
		products.add(pc);
		products.add(laptop);
		products.add(phone);
		products.add(tablet);

		category.setProducts(products);

		session.save(category);

		session.getTransaction().commit();

		// terminate session factory, otherwise program won't end
		HibernateUtil.getSessionFactory().close();
	}

}