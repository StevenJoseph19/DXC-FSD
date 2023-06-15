/*Algorithm:
	int[] arr = {5,4,1,6,2}
	Iteration 1 : 
		arr = {1,4,5,6,2}
		Total comparisons: 4
	Iteration 2 : 
		arr = {1,2,5,6,4}
		Total comparisons: 3
	Iteration 3 : 
		arr = {1,2,4,6,5}
		Total comparisons: 2
	Iteration 3 : 
		arr = {1,2,4,5,6}
		Total comparisons: 1
		
		Time complexity is O((n^2 - n)/2) ie; O(n^2)
		Space complexity is O(1)
		*/

package sorting.selectionsort;

public class SelectionSort {

	public static void sortAscending(final int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minElementIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minElementIndex] > arr[j]) {
					minElementIndex = j;
				}

			}

			if (minElementIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minElementIndex];
				arr[minElementIndex] = temp;

			}
		}
	}

	public static void sortDescending(final int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int maxElementIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[maxElementIndex] < arr[j]) {
					maxElementIndex = j;
				}

			}

			if (maxElementIndex != i) {
				int temp = arr[i];
				arr[i] = arr[maxElementIndex];
				arr[maxElementIndex] = temp;

			}
		}

	}
}
