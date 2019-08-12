package com.ssafy.step2.tree.linked;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExpressionBinaryTree {
	private TreeNode root;
	
	public void makeTree(String postExpression) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		int length = postExpression.length();
		
		for (int i = 0; i < length; ++i) {
			char c = postExpression.charAt(i);
			TreeNode node = new TreeNode (c);
			switch (c) {
				case '+':case '-':case '*':case '/':
					node.right = stack.pop();
					node.left = stack.pop();
					break;
			}
			stack.push(node);
		}
		root = stack.pop();
	}
	
	public void printByPreOrder() {
		printByPreOrder(root);
		System.out.println();
	}
	private void printByPreOrder(TreeNode current) {
		if(current!=null) {
			System.out.print(current.data+" ");
			printByPreOrder(current.left);
			printByPreOrder(current.right);
		}
	}
	public void printByInOrder() {
		printByInOrder(root);
		System.out.println();
	}
	private void printByInOrder(TreeNode current) {
		if(current!=null) {
			printByInOrder(current.left);
			System.out.print(current.data+" ");
			printByInOrder(current.right);
		}
	}
	public void printByPostOrder() {
		printByPostOrder(root);
		System.out.println();
	}
	private void printByPostOrder(TreeNode current) {
		if(current!=null) {
			printByPostOrder(current.left);
			printByPostOrder(current.right);
			System.out.print(current.data+" ");
		}
	}
	
	public void printByLevelOrder() {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		Queue<Integer> lev = new LinkedList<Integer>();
		q.add(root);
		lev.add(0);
		int temp=0;
		while(!q.isEmpty()) {
			TreeNode current = q.remove();
			int level = lev.remove();
			if(temp!=level) {
				System.out.println();
				temp=level;
			}
			if(current!=null) {
				System.out.print(current.data+" ");
				if(current.left!=null) { 
					q.add(current.left);
					lev.add(level+1);
				}
				if(current.right!=null) {
					q.add(current.right);
					lev.add(level+1);
				}
			}
			
		}
		
	}

}
