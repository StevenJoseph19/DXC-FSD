package com.hibernate.fetchtypes.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	static {
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(com.hibernate.fetchtypes.model.Books.class);
		configuration.addAnnotatedClass(com.hibernate.fetchtypes.model.Subject.class);
		configuration.setProperty("connection.driver_class", "com.mysql.jdbc.Driver");
		configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/FETCHDB");
		configuration.setProperty("hibernate.connection.username", "root");
		configuration.setProperty("hibernate.connection.password", "password");
		configuration.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
		configuration.setProperty("hibernate.hbm2ddl.auto", "create");
		configuration.setProperty("hibernate.show_sql", "true");
		configuration.setProperty(" hibernate.connection.pool_size", "10");

	
		// configuration
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		sessionFactory = configuration.buildSessionFactory(builder.build());
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}