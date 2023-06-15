package sorting.insertionsort;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsertionSortUnitTest {

	@Test
	public void givenUnsortedArray_WhenInsertionSortImperative_ThenSortedAsc() {
		int[] input = { 6, 2, 3, 4, 5, 1 };

		InsertionSort.insertionSortImperative(input);

		int[] expected = { 1, 2, 3, 4, 5, 6 };

		assertArrayEquals("The two arrays are not equal", expected, input);

	}

	@Test
	public void givenUnsortedArray_WhenInsertionSortRecursive_ThenSortedAsc() {
		int[] input = { 6, 2, 3, 4, 5, 1 };

		InsertionSort.insertionSortRecursive(input);

		int[] expected = { 1, 2, 3, 4, 5, 6 };

		assertArrayEquals("The two arrays are not equal", expected, input);

	}
}
