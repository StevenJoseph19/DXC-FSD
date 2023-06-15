/*Algorithm:
	Arr[] = {5,9,4,6,5,3}
	Pivot is 5
	=> {3,4,5,6,5,9}
	Pivot is 3 for left subarray
	=> {3,4,5,6,5,9}
	=> {3} is sorted
	Apply quicksort to right of pivot ie {4}
	=> Continue with right part of original array ie {6,5,9}
	=> {3,4,5,5,6,9} => Sorted array*/

package sorting.quicksort;

public class QuickSort {

	public static void quickSort(int arr[], int begin, int end) {
		if (begin < end) {
			int partitionIndex = partition(arr, begin, end);

			// Recursively sort elements of the 2 sub-arrays
			quickSort(arr, begin, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}
	}

	private static int partition(int[] arr, int begin, int end) {
		int pivot = arr[end];
		int i = begin - 1;

		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;

				int swapTemp = arr[i];
				arr[i] = arr[j];
				arr[j] = swapTemp;
			}

		}

		int swapTemp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = swapTemp;

		return i + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
