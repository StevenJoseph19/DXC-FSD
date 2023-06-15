package com.hibernate.relations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hibernate.relations.model.Payment;
import com.hibernate.relations.model.Ticket;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatefundamentals.m04.ex04");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Ticket ticket = new Ticket();
		ticket.setNumber("AA1234");
		ticket.setOrigin("London");
		ticket.setDestination("Bucharest");

		Payment payment = new Payment();

		payment.setTicket(ticket);
		payment.setAmount(200);

		em.persist(ticket);
		em.persist(payment);

		em.getTransaction().commit();

		emf.close();

	}

}
