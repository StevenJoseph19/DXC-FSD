package com.dxc;

public class UnitConverter {

	private static final int metersInOneNm = 1852;

	public static double fromNmToMeters(double nm) {
		return nm * metersInOneNm;
	}

	public static double fromMetersToNm(double meters) {
		return meters / metersInOneNm;
	}

	private static final double lbsInOneKg = 2.204622;

	public static double fromKgsToLbs(int kgs) {
		return kgs * lbsInOneKg;
	}
	
	public static double fromLbsToKgs(int lbs) {
		return lbs / lbsInOneKg;
	}
}
