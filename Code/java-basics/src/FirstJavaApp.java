import java.util.Arrays;

import shop.Customer;
import shop.VIPCustomer;

//import shop.Customer;
//import customer.Customer;

public class FirstJavaApp {

	public static void main(String[] args) {

//		System.out.println("Hello DXC-FSD");
//		System.out.println(2 + 3);
//		System.out.println("Hello " + "World");
//		System.out.println("Hello " , "World");

//		System.out.println("Hello " + args[0] + args[1] + args[2] + args[3]);
//		
//		shop.Customer customer = new shop.Customer();
//		customer.Customer customer1 = new customer.Customer();

//		Customer customer = new Customer();
		Customer customer = new VIPCustomer();
//		VIPCustomer customer = (VIPCustomer)new Customer();
//		Object 	customer =  new Object();
//		Object 	customer =  new VIPCustomer();

		customer.setName("Johnny");
		customer.setInterests(Arrays.asList("coding"));

		System.out.println(customer.getName() + " loves " + customer.getInterests().get(0));

//		System.out.println(customer.specificMethod());

	}

}
