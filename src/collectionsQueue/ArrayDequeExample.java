package collectionsQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {

		// Add or remove elements at both ends
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("ravi");
		deque.offer("usha");
		deque.offerLast("durga");
		deque.offerFirst("sai");
		deque.add("pinki");
		System.out.println("printing the queue:" + deque);
		deque.pollFirst();
		System.out.println("printing the queue after remvoving the head:" + deque);
		deque.pollLast();
		System.out.println("printing the queue after removing the last element:" + deque);

	}

}
