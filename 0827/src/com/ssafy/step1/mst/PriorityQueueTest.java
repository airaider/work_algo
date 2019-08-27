package com.ssafy.step1.mst;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2)*-1;
			}
		});
		PriorityQueue<Integer> q = new PriorityQueue<Integer>((x, y) -> y - x);
		q.add(10);
		q.add(5);
		q.add(3);
		q.add(20);
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
	}
	
	
	
}
