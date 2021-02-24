package collectionsQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		Queue<String> pqueue = new PriorityQueue<String>();
		pqueue.add("usha");
		pqueue.add("pinki");
		pqueue.add("sai");
		pqueue.add("usha");
		System.out.println("Printing the queue:" + pqueue);

		System.out.println(pqueue.element());
		System.out.println(pqueue.peek());

		System.out.println(pqueue.poll());
		System.out.println("Printing the queue:" + pqueue);
		pqueue.remove();
		System.out.println("Printing the queue after removing the element:" + pqueue);

		pqueue.add("durga");
		pqueue.add("kiran");
		System.out.println("Printing the queue after adding a element:" + pqueue);

	}

}
