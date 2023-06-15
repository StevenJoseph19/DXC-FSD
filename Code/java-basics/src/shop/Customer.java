package shop;

import java.util.List;

public class Customer {

	private int x;
	private String name;
	private List<String> interests;
	private Address address;

	public Customer() {
		super();

	}

	public Customer(String name, List<String> interests, Address address) {
//	public Customer(String name, List<String> interests) {
		super();
		this.name = name;
		this.interests = interests;
		this.address = address;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getInterests() {
		return interests;
	}

	public void setInterests(List<String> interests) {
		this.interests = interests;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void returnItem(String item) {

		System.out.println("I would like to return " + item + ".");
	}

}
