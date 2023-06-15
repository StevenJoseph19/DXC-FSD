package com.hibernate.relations.model;

import javax.persistence.Embeddable;

@Embeddable
public class Ticket {

	private String number;

	public Ticket() {

	}

	public Ticket(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
