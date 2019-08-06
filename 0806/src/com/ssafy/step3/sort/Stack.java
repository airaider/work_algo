package com.ssafy.step3.sort;


public class Stack {
	
	private static class Node{
		Object data;
		Node link;
		
		public Node() {
			
		}

		public Node(Object data) {
			super();
			this.data = data;
		}

		public Node(Object data, Node link) {
			this(data);
			this.link = link;
		}
	}
	
	private Node top;
	private int size;
	
	public void push(Object element) {
		Node newNode = new Node(element, top);
		top = newNode;
		size++;
	}
	
	public Object pop() {
		if(isEmpty()) {
			throw new RuntimeException("스택이 공백상태입니다.");
		}
		Node popNode = top;
		top = popNode.link;
		popNode.link=null;
		size--;
		return popNode.data;
	}
	
	public Object peek() {
		if(isEmpty()) {
			throw new RuntimeException("스택이 공백상태입니다.");
		}
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	public int size() {
		return size;
	}
	
}
