package shop;

import java.util.ArrayList;

public class Variables {

	public static void changeInt(int x) {
		x = 5;

	}

	public static void changeCustomer(Customer c) {
		c.setName("Els");
	}

	public static void changeCustomerInt(Customer c) {
		c.setX(5);
	}

	public static void main(String[] args) {
		int age = 30;
		String name = "Johnny";
//		double decimal = 7.8;
//		boolean lovesCoding = true;
//		
//		int a33 = 7;
//		int _33 = 7;
//		int $33 = 7;

//		int int = 7;
//		int goto = 7;
//		int while = 7;
//		int While = 7;
//		
//		int customerAge = 7;

		Address address = new Address("main street", "123a");
		Customer customer = new Customer(name, new ArrayList<>(), address);
		Customer customer2 = new Customer(name, new ArrayList<>(), address);

		System.out.println("before:" + age);
		changeInt(age);
		System.out.println("after:" + age);

		System.out.println("before:" + customer.getName());
		changeCustomer(customer);
		System.out.println("after:" + customer.getName());

		System.out.println("before:" + customer.getX());
		changeCustomerInt(customer);
		System.out.println("after:" + customer.getX());

	}

}
