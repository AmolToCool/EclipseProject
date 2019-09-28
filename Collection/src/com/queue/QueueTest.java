package com.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {

		PriorityQueue q=new PriorityQueue(15,new MyComparator());
		PriorityQueue q2=new PriorityQueue();
		
		q.offer("Z");
		q.offer("C");
		q.offer("A");
		q.offer("D");
		q.offer("B");
		q.offer("E");
		System.out.println(q);
		//q.offer(-1);
		/*for(int i=0;i<9;i++) {
		q.offer(i);
		}*/
		//System.out.println(q);
		/*q.offer(11);
		q.offer(113);
		q.offer(12);
		q.offer(14);
		q.poll();
		q.remove(1);*/
		//System.out.println(q2.element());//if queqe is empty & call this method then java.util.NoSuchElementException
		//System.out.println(q2.peek());//if queqe is empty & call this method then o/p show null
		//System.out.println(q2.poll());//if queqe is empty & call this method then o/p show null
		//System.out.println(q2.remove());//if queqe is empty & call this method then java.util.NoSuchElementException
		//System.out.println(q.element());
		//System.out.println(q.peek());
		//System.out.println(q);
	}

}
