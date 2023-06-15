package com.hibernate.mapping.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.hibernate.mapping.model.Article;
import com.hibernate.mapping.model.Category;
import com.hibernate.mapping.util.HibernateUtil;

/**
 * This program demonstrates how to use Hibernate framework to manage a
 * one-to-many association on a join table.
 *
 */
public class ArticlesManager {

	public static void main(String[] args) {
		// loads configuration and mappings
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		Category category = new Category("Hibernate Framework");

		Article articleOne = new Article("One-to-One Mapping", "One-to-One XML Mapping Tutorial",
				"Hibernate,One-to-One", "Content of One-to-One XML Mapping Tutorial", category);
		Article articleTwo = new Article("One-to-Many Mapping", "One-to-Many XML Mapping Tutorial",
				"Hibernate,One-to-Many", "Content of One-to-Many XML Mapping Tutorial", category);
		Article articleThree = new Article("Many-to-Many Mapping", "Many-to-Many XML Mapping Tutorial",
				"Hibernate,Many-to-Many", "Content of Many-to-Many XML Mapping Tutorial", category);

		Set<Article> articles = new HashSet<Article>();
		articles.add(articleOne);
		articles.add(articleTwo);
		articles.add(articleThree);

		category.setArticles(articles);

		session.save(category);
		session.getTransaction().commit();

		// terminate session factory, otherwise program won't end
		HibernateUtil.getSessionFactory().close();
	}

}