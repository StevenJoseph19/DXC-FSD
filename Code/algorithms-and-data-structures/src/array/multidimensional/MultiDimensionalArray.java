package array.multidimensional;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		int[][] multiArray = new int[3][3];

		String[][] multiArray2 = new String[3][10];

		String[][] westCoastCitiesGrouped = new String[][] { { "LA", "San Francisco", "San Diego" },
				{ "Seattle", "Tacoma" }, { "Portland" } };

		for (int i = 0; i < westCoastCitiesGrouped.length; i++) {
			for (int i1 = 0; i1 < westCoastCitiesGrouped[i].length; i1++) {

				System.out.println(westCoastCitiesGrouped[i][i1]);
			}

		}

		for (String[] row : westCoastCitiesGrouped) {
			for (String city : row) {
				System.out.println(city);
			}

		}

		System.out.println(Arrays.toString(westCoastCitiesGrouped));

	}

}
