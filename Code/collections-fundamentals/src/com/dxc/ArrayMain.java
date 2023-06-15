package com.dxc;

import java.util.Arrays;

public class ArrayMain {

//	public static void main(String[] args) {
//	public static void main(String args[] ) {
	public static void main(String... args ) {
		int[] ids = new int[10];
		System.out.println(ids);
		System.out.println(ids[0]);

//			String[] instruments= new String[3];
		String[] instruments = new String[] { "guitar", "drums", "bass" };
		System.out.println(instruments[0]);

		int[] ids2;
		int[] ids3;
		int ids4[];
		int ids5[];
		int[] ids6, ids7, ids8;

		System.out.println(instruments.length);

		for (int i = 0; i < ids.length; i++) {
//			for (int i = 0; i <= ids.length; i++) {

			ids[i] = i * i;
			System.out.println(ids[i]);

		}

		for (String instrument : instruments) {
			System.out.println(instrument);
		}

		Arrays.sort(instruments);
		System.out.println(Arrays.toString(instruments));
		
		int[] fibArray = new int[] {0, 1, 5, 2, 3, 1, 8, 13};
		
		System.out.println(Arrays.binarySearch(fibArray, 3));
		
		Arrays.sort(fibArray);
		System.out.println(Arrays.toString(fibArray));
		System.out.println(Arrays.binarySearch(fibArray, 3));
		
		System.out.println(Arrays.toString(args));
		
	}

}
