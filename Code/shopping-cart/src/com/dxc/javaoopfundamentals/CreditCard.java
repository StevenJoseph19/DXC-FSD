package com.dxc.javaoopfundamentals;

public class CreditCard {
	
	private final long cardNumber;

	CreditCard(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + "]";
	}
	
	

}
