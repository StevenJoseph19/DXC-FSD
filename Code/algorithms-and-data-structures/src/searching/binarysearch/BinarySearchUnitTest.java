package searching.binarysearch;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchUnitTest {

	int[] sortedArray = { 0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9 };
	int key = 6;
	int expectedIndexForSearchKey = 7;
	int low = 0;
	int high = sortedArray.length - 1;
	List<Integer> sortedList = Arrays.asList(0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9);

	@Test
	public void givenASortedArrayOfIntegers_WhenBinarySearchRunIteratively_ThenGetIndexOfNumber() {
		BinarySearch binSearch = new BinarySearch();
		Assert.assertEquals(expectedIndexForSearchKey,
				binSearch.runBinarySearchIteratively(sortedArray, key, low, high));
	}

	@Test
	public void givenASortedArrayOfIntegers_WhenBinarySearchRunRecursively_ThenGetIndexOfNumber() {
		BinarySearch binSearch = new BinarySearch();
		Assert.assertEquals(expectedIndexForSearchKey,
				binSearch.runBinarySearchRecursively(sortedArray, key, low, high));
	}

	@Test
	public void givenASortedArrayOfIntegers_WhenBinarySearchRunUsingArraysClassStaticMethodForANumber_ThenGetIndexOfTheNumber() {
		BinarySearch binSearch = new BinarySearch();
		Assert.assertEquals(expectedIndexForSearchKey, binSearch.runBinarySearchUsingJavaArrays(sortedArray, key));
	}

	@Test
	public void givenASortedArrayOfIntegers_WhenBinarySearchRunUsingCollectionsClassStaticMethodForANumber_ThenGetIndexOfTheNumber() {
		BinarySearch binSearch = new BinarySearch();
		Assert.assertEquals(expectedIndexForSearchKey, binSearch.runBinarySearchUsingJavaCollections(sortedList, key));
	}
}