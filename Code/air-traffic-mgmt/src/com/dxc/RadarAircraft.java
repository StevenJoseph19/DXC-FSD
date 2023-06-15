package com.dxc;

import static java.lang.System.*;

public class RadarAircraft {

	private String callSign;
	private int altitude;
	private int rateClimbDescent;
	private int speedKmh;
	private int remainingFuel;

	RadarAircraft(String callSign, int altitude, int rateClimbDescent, int speedKmh, int remainingFuel) {
		super();
		this.callSign = callSign;
		this.altitude = altitude;
		this.rateClimbDescent = rateClimbDescent;
		this.speedKmh = speedKmh;
		this.remainingFuel = remainingFuel;
	}

	public int calculateRange(int fuelConsumptionLitersPerHour) throws ArithmeticException {

		int flightHours = remainingFuel / fuelConsumptionLitersPerHour;

		// Just for explaining what happens when we change
		// primitive type arguments passed into method
		fuelConsumptionLitersPerHour = 0;

		return flightHours * speedKmh;

	}

	public void printLabel(RadarLabelOptions displayOptions) {
		StringBuilder sb = new StringBuilder(callSign);
		sb.append("\n");
		sb.append("FL ").append(altitude);

		if (displayOptions.isShowAltitudeTrendArrow()) {

			if (rateClimbDescent > 0) {
				sb.append(" ▲");


			} else if (rateClimbDescent < 0) {
				sb.append("  ▼");
	
			}

			if (displayOptions.isShowSpeed()) {
				sb.append("/n");
				sb.append(speedKmh).append(" kmh");
			}

			out.println(sb);

			displayOptions.setShowAltitudeTrendArrow(false);

		}
	}

}
