/*Algorithm:
	int[] sortedArray = { 7, 12,34, 57, 65, 74, 82, 88, 89, 93, 100};// Element to search for is 93
	sortedArray[0] = 7 // != 93
	int i= 1 // 2^0 ==1
	sortedArray[1] = 12 // != 93
	int i= 2 // 2^1 ==2
	sortedArray[2] = 34 // != 93
	
	// Generate values powers of 2 => (2,4,8,16,..}
	// Check till int[i] <=key
	// Divide index by 2
	// Select sub - array after this index (including the index of i)
	// apply binary search
*/
package searching.exponentialsearch;

import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 10, 40 };
		int x = 10;
		int result = exponentialSearch(arr, arr.length, x);

		System.out.println(
				(result < 0) ? "Element is not present in the array" : "Element is  present at index " + result);

	}

	// Returns position of first occurrence
	// of x in array
	static int exponentialSearch(int[] arr, int n, int x) {

		// If x is present at first location itself
		if (arr[0] == x)
			return 0;

		// Find range for binary search
		// by repeated doubling
		int i = 1;
		while (i < n && arr[i] <= x)
			i = i * 2;

		// Call binary search for the found range.
		return Arrays.binarySearch(arr, i / 2, Math.min(i, n - 1), x);

	}

}
