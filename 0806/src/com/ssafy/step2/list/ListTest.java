package com.ssafy.step2.list;

public class ListTest {

	public static void main(String[] args) {
//		SimpleLinkedList list = new SimpleLinkedList();.
		DoubledLinkedList list = new DoubledLinkedList();
		list.print();
		list.addLastNode("그대라는 시");
		list.print();
		list.addFirstNode("안녕하세요");
		list.print();
		list.addFirstNode("kill this love");
		list.print();
		list.deleteFirstNode();
		list.print();
		list.deleteLastNode();
		list.print();
	}

}