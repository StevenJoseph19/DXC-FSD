package com.hibernate.mapping.main;

import java.util.Date;

import org.hibernate.Session;

import com.hibernate.mapping.model.Author;
import com.hibernate.mapping.model.Book;
import com.hibernate.mapping.util.HibernateUtil;

/**
 * This program demonstrates using Hibernate framework to manage
 * a one-to-one entity relationship.
 *
 */
public class BooksManager {

	public static void main(String[] args) {
		// loads configuration and mappings
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		// creates a Book entity
		Book newBook = new Book();
		newBook.setTitle("Effective Java");
		newBook.setDescription("Best practices for Java programming");
		newBook.setPublishedDate(new Date());
		newBook.setAuthor(new Author("Joshua Bloch", "joshua.bloch@gmail.com"));

		// persists the book entity
		Long bookId = (Long) session.save(newBook);

		// gets the book entity back
		Book book = (Book) session.get(Book.class, bookId);
		System.out.println("Title: " + book.getTitle());
		System.out.println("Description: " + book.getDescription());

		Author author = book.getAuthor();
		System.out.println("Author's name: " + author.getName());
		System.out.println("Author's email: " + author.getEmail());

		session.getTransaction().commit();

		// terminate session factory, otherwise program won't end
		HibernateUtil.getSessionFactory().close();
	}

}