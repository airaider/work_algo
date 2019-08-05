package com.ssafy.step2.queue;

import javax.management.RuntimeErrorException;

public class Q_test {
	private Object[] queue;
	private final int MAX_SIZE;
	private int front, rear;	//front : 마지막으로 dequeue된 원소자리
								//rear : 마지막으로 

	public Q_test(int maxSize) {
		MAX_SIZE=maxSize;
		queue = new Object[MAX_SIZE];
		front = rear = -1;
	}
	public boolean isEmpty() {
		return front == rear;
	}
	public boolean isFull() {
		return rear == MAX_SIZE-1;
	}
	public void enQueue(Object item) {
		if(isFull()) throw new RuntimeException("큐가 포화상태입니다.");
		queue[++rear] = item;
	}
	public Object peek() {
		if(isEmpty()) {
			throw new RuntimeException("큐가 공백상태입니다.");
		}
		return queue[front+1];
	}
	public Object deQueue() {
		Object result = peek();
		queue[++front]=null;
		return result;
	}
}
