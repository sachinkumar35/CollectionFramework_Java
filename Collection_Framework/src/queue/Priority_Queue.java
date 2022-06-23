package queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {

	public static void main(String[] args) {
		
		Queue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(40);
		pq.offer(44);
		pq.offer(23);
		pq.offer(35);

		System.out.println(pq); // output: [23, 35, 40, 44]  because it default print minHeap
		
//	if here i write poll then which element's priority is low that will remove and here the element is 23
		pq.poll();
//	now if i see result;
		System.out.println(pq);
		
//	peek will do same like linkedList Queue -> which element will poll next that will print using peek
		System.out.println(pq.peek());
		
		System.out.println();
		
//	But now we want bigger element print first 
//		-> priority of big element should be high
		
//		we have to use: Comparator.reverseOrder()
//		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
		
		pq1.offer(40);
		pq1.offer(12);
		pq1.offer(24);
		pq1.offer(36);

		System.out.println(pq1);
		
	}

}
