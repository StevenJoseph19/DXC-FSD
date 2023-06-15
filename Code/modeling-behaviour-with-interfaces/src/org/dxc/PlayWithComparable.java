package org.dxc;

import org.dxc.model.Capital;
import org.dxc.model.City;

public class PlayWithComparable {

	public static void main(String[] args) {

		Comparable<Capital> paris = new Capital();
//		paris.setName();

		Capital london = new Capital();
		london.setName("london");

		Comparable<Capital> londonComparable = london;

//		City newYork = new City();
//		Comparable<Capital> comparable = (Comparable<Capital>) newYork;
//		Comparable<Capital> comparable = (Comparable) newYork;

//		if (londonComparable instanceof Comparable) {
		City newYork = new Capital();
		Comparable<Capital> comparable = (Comparable) newYork;

//		}

	}

}
