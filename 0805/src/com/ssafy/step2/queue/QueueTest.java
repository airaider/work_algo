package com.ssafy.step2.queue;

public class QueueTest {

	public static void main(String[] args) {
		Q_test queue = new Q_test(5);
		queue.enQueue("spring");
		System.out.println(queue.deQueue());
		queue.enQueue("ssummer");
		System.out.println(queue.deQueue());
		queue.enQueue("fall");
		System.out.println(queue.deQueue());
		queue.enQueue("winter");
		System.out.println(queue.deQueue());
		queue.enQueue("hello");
		System.out.println(queue.deQueue());
		queue.enQueue("cheer up");
		System.out.println(queue.deQueue());
		
	}

}
