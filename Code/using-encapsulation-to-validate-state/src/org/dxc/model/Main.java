package org.dxc.model;

public class Main {

	public static void main(String[] args) {
//		City city = new City();
		City city = new City("Paris");
		city.setPopulation(10);
//		city.setPopulation(-10);
//		city.name = "Paris";
//		city.name = "__";
//		city.population = 10;
//		city.population = -10;
		
//		System.out.println("Name = " + city.name);
//		System.out.println("Population = " + city.population);
		
		System.out.println("Name = " + city.getName());
		System.out.println("Population = " + city.getPopulation());

	}

}
