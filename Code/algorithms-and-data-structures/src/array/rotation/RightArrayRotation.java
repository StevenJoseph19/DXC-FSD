/*
 * Algorithm:
 * int[] arr = {20,30,40};
 * Left by 1=>[30,40,20]
 * Right by 1 =>[40,20,30]
 * 
 * */

package array.rotation;

import java.util.Arrays;

public class RightArrayRotation {

	public static void main(String[] args) {
		// Initialize array
		int[] arr = { 1, 2, 3, 4, 5 };

		// k determines the number of times an array is to be rotated
		int k = 2;

		System.out.println("Original Array");
		// Displays the original array
		System.out.println(Arrays.toString(arr));

		// Calls the left rotation function
		rightRotation(arr, k);

		// Displays the rotated array
		System.out.println("After right rotation Array");
		System.out.println(Arrays.toString(arr));

	}

	private static void rightRotation(int[] arr, int k) {
		// check for the base condition
		if (k == 0 || k % arr.length == 0) {
			return;
		}

		k = k % arr.length;

		// Rotate the given array by k times towards left
		for (int i = 0; i < k; i++) {
			int j, last;
			// Stores the last lement of the array
			last = arr[arr.length - 1];

			for (j = arr.length - 1; j > 0; j--) {
				// Shift element of array by 1
				arr[j] = arr[j - 1];
			}
			// Last element of the array will now be added to the start of the array
			arr[0] = last;
		}

	}

}
