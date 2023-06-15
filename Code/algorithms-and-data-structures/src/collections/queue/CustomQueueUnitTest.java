package collections.queue;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomQueueUnitTest {

	private CustomQueue<Integer> customQueue;

	@Before
	public void setUp() throws Exception {
		customQueue = new CustomQueue<>();
	}

	@Test
	public void givenQueueWithTwoElements_WhenElementsRetrieved_CheckRetievalIsCorrect() {
		customQueue.add(7);
		customQueue.add(5);

		int first = customQueue.poll();
		int second = customQueue.poll();

		assertEquals(7, first);
		assertEquals(5, second);
	}

}
