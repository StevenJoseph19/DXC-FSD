package org.dxc.model;

public class City extends Object {

	private final String name;
//	private String name;
	private int population;

//	public City() {
//		this("");
//	}

	public City(String name) {
//		super();
//		System.out.println();
//		this.name = name;
		this(name,0);
	}

	public City(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public void setPopulation(int population) {
		this.population = population;
	}

}
