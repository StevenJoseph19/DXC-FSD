/*
 * Algorithm:
 * Sort the given array and return the element at index K-1 in the sorted array.
 * 
 * 1. Sort the input array in increasing order.
 * 2. Return the element at the K-1 index (0 - based indexing) in the sorted array
 * 
 * */

package array.order.statistics;

import java.util.Arrays;

public class KthSmallestElement {

	// Function to return K'th smallest element
	// in a given array.
	public static int kthSmallest(Integer[] arr, int k) {
		// Sort the given array
		Arrays.sort(arr);

		// Return the K'th element in
		// the sorted array
		return arr[k - 1];
	}

	// Driver code
	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
		int k = 2;

		// Function call
		System.out.println("K'th smallest element is " + kthSmallest(arr, k));
	}

}
