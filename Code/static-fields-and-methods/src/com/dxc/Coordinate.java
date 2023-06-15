package com.dxc;

public class Coordinate {

	private double lat;
	private double lon;

	public static Coordinate origin() {
		return new Coordinate();
	}

	public static Coordinate of(double lat, double lon) {
		Coordinate c = new Coordinate();
		c.lon = lon;
		c.lat = lat;
		return c;
	}

	public static Coordinate fromLatLonString(String coordinate) {
		Coordinate c = new Coordinate();
		c.lat = Double.parseDouble(coordinate.split(" ")[0]);
		c.lon = Double.parseDouble(coordinate.split(" ")[1]);
		return c;
	}

	// Used to instantiate origin coordinates
//	Coordinate() {
//
//	}

//	Coordinate(double lat, double lon) {
//		this.lat = lat;
//		this.lon = lon;
//	}

	// ex: 43 45
//	Coordinate(String coordinate) {
//		this.lat = Double.parseDouble(coordinate.split(" ")[0]);
//		this.lon = Double.parseDouble(coordinate.split(" ")[1]);
//	}

	@Override
	public String toString() {
		return "Coordinate [lat=" + lat + ", lon=" + lon + "]";
	}

}
