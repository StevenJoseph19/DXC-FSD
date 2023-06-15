package collections.queue;

import static org.junit.Assert.*;

import java.util.PriorityQueue;

import org.junit.Test;

public class PriorityQueueUnitTest {

	@Test
	public void givenIntegerQueue_WhenIntegersAddedOutOfOrder_CheckRetrievalOrderIsNatural() {
		PriorityQueue<Integer> integerQueue = new PriorityQueue<>();

		integerQueue.add(9);
		integerQueue.add(2);
		integerQueue.add(4);

		int first = integerQueue.poll();
		int second = integerQueue.poll();
		int third = integerQueue.poll();

		assertEquals(2, first);
		assertEquals(4, second);
		assertEquals(9, third);

	}

	@Test
	public void givenStringQueue_WhenStringsAddedOutOfOrder_CheckRetrievalOrderIsNatural() {
		PriorityQueue<String> stringQueue = new PriorityQueue<>();

		stringQueue.add("banana");
		stringQueue.add("apple");
		stringQueue.add("cherry");

		String first = stringQueue.poll();
		String second = stringQueue.poll();
		String third = stringQueue.poll();

		assertEquals("apple", first);
		assertEquals("banana", second);
		assertEquals("cherry", third);

	}

}
