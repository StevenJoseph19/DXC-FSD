package sorting.bubblesort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleSortUnitTest {

	@Test
	void givenIntegerArray_WhenSortedWithBubbleSort_ThenGetSortedArray() {
		Integer[] array = { 2, 1, 4, 6, 3, 5 };
		Integer[] sortedArray = { 1, 2, 3, 4, 5, 6 };

		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSort(array);

		assertArrayEquals(sortedArray, array);

	}

	@Test
	void givenIntegerArray_WhenSortedWithOptimizedBubbleSort_ThenGetSortedArray() {
		Integer[] array = { 2, 1, 4, 6, 3, 5 };
		Integer[] sortedArray = { 1, 2, 3, 4, 5, 6 };

		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.optimizedBubbleSort(array);

		assertArrayEquals(sortedArray, array);

	}

}
