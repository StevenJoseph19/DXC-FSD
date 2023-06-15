package sorting.selectionsort;

import static org.junit.Assert.*;

import org.junit.Test;

public class SelectionSortUnitTest {

	@Test
	public void givenUnSortedArray_WhenSelectionSortAscending_ThenSortedAsc() {
		int[] input = { 5, 4, 1, 6, 2 };
		SelectionSort.sortAscending(input);
		int[] expected = { 1, 2, 4, 5, 6 };
		assertArrayEquals("The two arrays are not equal", expected, input);
	}

	@Test
	public void givenUnSortedArray_WhenSelectionSortDescending_ThenSortedDesc() {
		int[] input = { 5, 4, 1, 6, 2 };
		SelectionSort.sortDescending(input);
		int[] expected = { 6, 5, 4, 2, 1 };
		assertArrayEquals("The two arrays are not equal", expected, input);
	}

}
