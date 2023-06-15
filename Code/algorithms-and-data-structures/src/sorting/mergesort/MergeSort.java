//Time Complexity:
//	T(n) = 2T(n/2) +O(n)
//	 2T(n/2) -- Time required to sort the sub arrays
//	 O(n) - Time to merge the entire array
//   Time complexity is O(nLogn)

package sorting.mergesort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] a = {5,1,6,2,3,4};
		mergeSort(a, a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	public static void mergeSort(int[] a, int n) {
		if (n < 2)
			return;

		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = a[i];

		}

		for (int i = mid; i < n; i++) {
			r[i - mid] = a[i];

		}

		mergeSort(l, mid);
		mergeSort(r, n - mid);

		merge(a, l, r, mid, n - mid);
		
		System.out.println(Arrays.toString(a));
	}

	private static void merge(int[] a, int[] l, int[] r, int left, int right) {

		int i = 0, j = 0, k = 0;

		while (i < left && j < right) {

			if (l[i] <= r[j])
				a[k++] = l[i++];

			else

				a[k++] = r[j++];

		}
		
		while (i < left) {
			a[k++] = l[i++];
			
		}
		
		while (j < right) {
			a[k++] = r[j++];
			
		}


	}
}
