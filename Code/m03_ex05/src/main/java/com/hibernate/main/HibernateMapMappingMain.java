package com.hibernate.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.model.Question;
import com.hibernate.util.HibernateUtil;

public class HibernateMapMappingMain {

	public static void main(String[] args) {

		// Get Session
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		// Start transaction
		session.beginTransaction();

		Map<String, String> map1 = new HashMap<>();
		map1.put("Java is a programming language", "John Milton");
		map1.put("Java is a platfor", "Ashok Kumar");

		Map<String, String> map2 = new HashMap<>();
		map2.put("Servlet technology is a server side programming language", "John Milton");
		map2.put("Servlet is an interface", "Ashok Kumar");
		map2.put("Servlet is a package", "Rahul Kumar");

		Question question1 = new Question("What is Java?", "Alok", map1);

		Question question2 = new Question("What is a Servlet?", "Jai Dixit", map2);

		session.persist(question1);
		session.persist(question2);

		Query query = session.createQuery("from Question");
		List<Question> list = query.list();

		Iterator<Question> itr = list.iterator();
		while (itr.hasNext()) {
			Question question = itr.next();
			System.out.println("Question Id: " + question.getId());
			System.out.println("Question Name: " + question.getName());
			System.out.println("Question Posted By: " + question.getUsername());
			System.out.println("Answers----------");

			Map<String, String> map = question.getAnswers();
			Set<Map.Entry<String, String>> set = map.entrySet();

			Iterator<Map.Entry<String, String>> iteratoranswer = set.iterator();
			while (iteratoranswer.hasNext()) {
				Map.Entry<String, String> entry = iteratoranswer.next();
				System.out.println("Answer Given: " + entry.getKey());
				System.out.println("Answer Posted By: " + entry.getValue());
			}

		}
		System.out.println("Success!");

		// Commit transaction
		session.getTransaction().commit();

		// terminate session factory; otherwise program won't end
		HibernateUtil.getSessionFactory().close();

	}

}
