package com.springhibernate.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springhibernate.dao.PersonDAO;
import com.springhibernate.model.Person;

public class SpringHibernateMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");

		PersonDAO personDAO = context.getBean(PersonDAO.class);

		Person person = new Person();
		person.setName("John");
		person.setCountry("Australia");

		personDAO.save(person);

		System.out.println("Person::" + person);

		List<Person> list = personDAO.list();

		for (Person p : list) {
			System.out.println("Person List::" + p);
		}

		context.close();

	}

}
