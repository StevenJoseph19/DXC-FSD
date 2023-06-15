package com.hibernate.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.model.Employee1;

public class HibernateUtil {

	// XML based configuration
	private static SessionFactory sessionFactory;

	// Annotation based configuration
	private static SessionFactory sessionAnnotationFactory;

	// Property based configuration
	private static SessionFactory sessionJavaConfigFactory;

	private static SessionFactory buildSessionFactory() {
		try {
			// Create the Session Factory from hibernate.cfg.xml
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			System.out.println("Hibernate Configuration loaded");

			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			System.out.println("Hibernate Service Registry created");

			SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

			return sessionFactory;
		} catch (Throwable ex) {
			// Make sure you log the exception as it may be swallowed
			System.err.println("Initial SessionFactory creation failed : " + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	private static SessionFactory buildSessionAnnotationFactory() {
		try {
			// Create the Session Factory from hibernate-annotation.cfg.xml
			Configuration configuration = new Configuration();
			configuration.configure("hibernate-annotation.cfg.xml");
			System.out.println("Hibernate Annotation Configuration loaded");

			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			System.out.println("Hibernate Annotation Service Registry created");

			SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

			return sessionFactory;
		} catch (Throwable ex) {
			// Make sure you log the exception as it may be swallowed
			System.err.println("Initial SessionFactory creation failed : " + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	private static SessionFactory buildSessionJavaConfigFactory() {
		try {

			Configuration configuration = new Configuration();

			// Create Properties, can be read from properties file too
			Properties props = new Properties();
			props.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
			props.put("hibernate.connection.url", "jdbc:mysql://localhost/EMPLOYEE");
			props.put("hibernate.connection.username", "root");
			props.put("hibernate.connection.password", "password");
			props.put("hibernate.current_session_context_class", "thread");

			configuration.setProperties(props);
			configuration.addAnnotatedClass(Employee1.class);

			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			System.out.println("Hibernate Java Service Registry created");

			SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

			return sessionFactory;
		} catch (Throwable ex) {
			// Make sure you log the exception as it may be swallowed
			System.err.println("Initial SessionFactory creation failed : " + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null)
			sessionFactory = buildSessionFactory();
		return sessionFactory;
	}

	public static SessionFactory getSessionAnnotationFactory() {
		if (sessionAnnotationFactory == null)
			sessionAnnotationFactory = buildSessionAnnotationFactory();
		return sessionAnnotationFactory;
	}

	public static SessionFactory getSessionJavaConfigFactory() {
		if (sessionJavaConfigFactory == null)
			sessionJavaConfigFactory = buildSessionJavaConfigFactory();
		return sessionJavaConfigFactory;
	}
}
