package searching.linearsearch;

public class LinearSearch {

	private static int linearSearch(int[] array, int x) {

		int n = array.length;

		// Going through the array sequentially
		for (int i = 0; i < n; i++) {
			if (array[i] == x) {
				return i;

			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int array[] = { 2, 4, 0, 1, 9 };
		int x = 1;

		int result = linearSearch(array, x);

		if (result == -1)
			System.out.println("Element not found");
		else

			System.out.println("Element found at index: " + result);

	}

}
