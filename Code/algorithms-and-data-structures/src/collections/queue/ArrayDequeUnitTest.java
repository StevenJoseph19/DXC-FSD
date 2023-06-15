package collections.queue;

import static org.junit.Assert.*;

import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.Test;

public class ArrayDequeUnitTest {

	@Test
	public void whenPush_AddsAtFirst() {

		final Deque<String> deque = new ArrayDeque<>();

		deque.push("first");
		deque.push("second");

		assertEquals("second", deque.getFirst());
	}

	@Test
	public void whenPop_RemovesLast() {

		final Deque<String> deque = new ArrayDeque<>();

		deque.push("first");
		deque.push("second");

		assertEquals("second", deque.pop());
	}

	@Test
	public void whenOffer_AddsAtLast() {

		final Deque<String> deque = new ArrayDeque<>();

		deque.offer("first");
		deque.offer("second");

		assertEquals("second", deque.getLast());
	}
	
	@Test
	public void whenPoll_RemovesFirst() {

		final Deque<String> deque = new ArrayDeque<>();

		deque.offer("first");
		deque.offer("second");

		assertEquals("first", deque.poll());
	}
}
