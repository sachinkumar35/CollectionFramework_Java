package queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Queue {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(12); // we add elements by the help of offer
		queue.offer(23);
		queue.offer(34);
		
		System.out.println(queue);
		
//	to remove element from queue list by using 'poll()'
		System.out.println(queue.poll());  // ---> we can print this removed element 
		System.out.println(queue);
		
//	peek it tells which element is next in line to go outside
		System.out.println(queue.peek());
		System.out.println(queue);
		
	}
}
