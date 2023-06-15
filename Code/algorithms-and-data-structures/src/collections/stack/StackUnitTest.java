package collections.stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.Test;

public class StackUnitTest {

	@Test
	public void whenStackIsCreated_ThenItHasSizeZero() {
		Stack<Integer> intStack = new Stack<>();

		assertEquals(0, intStack.size());
	}

	@Test
	public void whenElementIsPushed_ThenStackSizeIsIncreased() {
		Stack<Integer> intStack = new Stack<>();
		intStack.push(1);

		assertEquals(1, intStack.size());
	}

	@Test
	public void whenMultipleElementsArePushed_ThenStackSizeIsIncreased() {
		Stack<Integer> intStack = new Stack<>();
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		boolean result = intStack.addAll(intList);

		assertTrue(result);
		assertEquals(7, intStack.size());
	}

	@Test
	public void whenElementIsPoppedFromStack_ThenElementIsRemovedAndSizeChanges() {
		Stack<Integer> intStack = new Stack<>();
		intStack.push(5);

		Integer element = intStack.pop();

		assertEquals(Integer.valueOf(5), element);
		assertTrue(intStack.isEmpty());
	}

	@Test
	public void whenElementIsPeekedFromStack_ThenElementIsNotRemovedAndSizeDoesNotChange() {
		Stack<Integer> intStack = new Stack<>();
		intStack.push(5);

		Integer element = intStack.peek();

		assertEquals(Integer.valueOf(5), element);
		assertEquals(1, intStack.search(5));
		assertEquals(1, intStack.size());
	}

	@Test
	public void whenElementIsOnStack_ThenSearhReturnsItsDistanceFromtheTop() {
		Stack<Integer> intStack = new Stack<>();
		intStack.push(5);
		intStack.push(6);

		assertEquals(2, intStack.search(5));

	}

	@Test
	public void whenElementIsOnStack_ThenIndexOfReturnsItsIndex() {
		Stack<Integer> intStack = new Stack<>();
		intStack.push(5);

		int indexOf = intStack.indexOf(5);

		assertEquals(0, indexOf);

	}

	@Test
	public void whenMultipleElementsAreOnStack_ThenLastIndexOfReturnsItsIndex() {
		Stack<Integer> intStack = new Stack<>();
		intStack.push(5);
		intStack.push(5);
		intStack.push(5);

		int indexOf = intStack.lastIndexOf(5);

		assertEquals(2, indexOf);

	}

	@Test
	public void whenRemoveElementIsInvoked_ThenElementIsRemoved() {
		Stack<Integer> intStack = new Stack<>();
		intStack.push(5);
		intStack.push(5);

		intStack.removeElement(5);

		assertEquals(1, intStack.size());

	}

	@Test
	public void whenRemoveElementAtIsInvoked_ThenElementIsRemoved() {
		Stack<Integer> intStack = new Stack<>();
		intStack.push(5);
		intStack.push(7);

		intStack.removeElementAt(1);

		assertEquals(-1, intStack.search(7));

	}

	@Test
	public void whenRemoveAllElementsIsInvoked_ThenAllElementsAreRemoved() {
		Stack<Integer> intStack = new Stack<>();
		intStack.push(5);
		intStack.push(7);

		intStack.removeAllElements();

		assertTrue(intStack.isEmpty());

	}

	@Test
	public void whenRemoveAllIsInvoked_ThenAllElementsFromCollectionAreRemoved() {
		Stack<Integer> intStack = new Stack<>();
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		intStack.addAll(intList);
		intStack.add(500);

		intStack.removeAll(intList);

		assertEquals(1, intStack.size());
		assertEquals(1, intStack.search(500));

	}

	@Test
	public void whenRemoveIfIsInvoked_ThenAllElementsSatisfyingConditionAreRemoved() {
		Stack<Integer> intStack = new Stack<>();
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		intStack.addAll(intList);

		intStack.removeIf(element -> element < 6);

		assertEquals(2, intStack.size());

	}

	@Test
	public void whenAnotherStackCreatedWhileTraversingStack_ThenStacksAreEqual() {
		Stack<Integer> intStack = new Stack<>();
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		intStack.addAll(intList);

		ListIterator<Integer> it = intStack.listIterator();

		Stack<Integer> result = new Stack<>();
		while (it.hasNext()) {
			result.push(it.next());

		}

		assertThat(result, equalTo(intStack));

	}

	@Test
	public void whenStackIsFiltered_ThenAllElementsNotSatisfyingFilterConditionAreDiscarded() {
		Stack<Integer> intStack = new Stack<>();
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		intStack.addAll(intList);

		List<Integer> filtered = intStack.stream().filter(element -> element <= 3).collect(Collectors.toList());

		assertEquals(3, filtered.size());

	}
}
