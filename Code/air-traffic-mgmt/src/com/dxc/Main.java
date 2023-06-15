package com.dxc;

import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {

		RadarAircraft r0123 = new RadarAircraft("R0123", 280, 20, 895, 20000);

		// Change range and see the effect of changing
		// primitive fuel type parameter within method
		int fuelConsumptionLitersPerHour = 2000;
		int r0123Range = r0123.calculateRange(fuelConsumptionLitersPerHour);

		out.println("Range is " + r0123Range + " km");
		out.println(fuelConsumptionLitersPerHour);

		// Print radar label and see effect of changing
		// reference type parameter within a method
		RadarLabelOptions options = new RadarLabelOptions(true, false);

		out.println();
		r0123.printLabel(options);
		out.println(options.isShowAltitudeTrendArrow());
		out.println(options.isShowSpeed());

	}

}
