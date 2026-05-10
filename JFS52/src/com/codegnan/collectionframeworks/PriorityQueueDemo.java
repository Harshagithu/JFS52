package com.codegnan.collectionframeworks;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>();
		pq.offer(30);
		pq.offer(10);
		pq.offer(20);
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);

	}

}
