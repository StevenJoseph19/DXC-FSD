package org.dxc.model;

public class City {

//	String name;
//	int population;

	private final String name;
	private int population;

	public City(String name) {
		this.name = name;
	}

	public String getName() {

		return this.name;
	}

	public int getPopulation() {

		return this.population;
	}

	public void setPopulation(int population) {
		if (population < 0) {
			throw new IllegalArgumentException("Population cannot be negative");
		}
		this.population = population;

	}

}
