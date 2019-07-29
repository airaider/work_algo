package com.ssafy.step3.stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("월요일");
		stack.push("화요일");
		stack.push("수요일");
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.pop());

		System.out.println(stack.peek());
		System.out.println(stack.size());
	}

}
