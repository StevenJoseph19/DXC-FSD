/*Algorithm:
	4 2 1 6 3 5 - Pass 1
	[2 4] 1 6 3 5
	2 [4 1] 6 3 5
	2 1 [4 6 ]3 5
	2 1 4 [3 6]5
	2 1 4 3 [5 6]
	
	[1 2] 4 3 5 6 - Pass 2 
	1 2 [3 4]5 6  --  Array is sorted
	*/

package sorting.bubblesort;

import java.util.stream.IntStream;

public class BubbleSort {

	void bubbleSort(Integer[] arr) {

		int n = arr.length;
		IntStream.range(0, n - 1).flatMap(i -> IntStream.range(1, n - i)).forEach(j -> {
			if (arr[j - 1] > arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}

		});

	}

	void optimizedBubbleSort(Integer[] arr) {

		int i = 0, n = arr.length;

		boolean swapNeeded = true;

		while (i < n - 1 && swapNeeded) {
			swapNeeded = false;

			for (int j = 1; j < n - i; j++) {

				if (arr[j - 1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					swapNeeded = true;
				}
			}
			if (!swapNeeded)
				break;

			i++;

		}

	}

}
