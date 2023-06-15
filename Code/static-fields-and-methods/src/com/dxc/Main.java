package com.dxc;

public class Main {

	public static void main(String[] args) {

		System.out.println(UnitConverter.fromKgsToLbs(100));
		System.out.println(UnitConverter.fromNmToMeters(2));

//		Coordinate c1 = new Coordinate();
//		Coordinate c2 = new Coordinate(10, 20);
//		Coordinate c3 = new Coordinate("45 78");

		Coordinate c1 = Coordinate.origin();
		Coordinate c2 = Coordinate.of(10, 20);
		Coordinate c3 = Coordinate.fromLatLonString("45 78");

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
