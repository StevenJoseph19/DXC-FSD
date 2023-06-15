package com.dxc.javaoopfundamentals;

public class Customer {

	private final String name;
	private CreditCard creditCard;

	Customer(String name, CreditCard creditCard) {
		this.name = name;
		this.creditCard = creditCard;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", creditCard=" + creditCard + "]";
	}

}
