package com.ssafy.step2.tree.linked;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedBinaryTree {
	
	private TreeNode root;
	private int size;
	
	public void add(Object pData, Object data) {
		TreeNode pNode = getNode(root, pData);
		if(pNode == null && size == 0) {
			root = pNode = new TreeNode(pData);
			size++;
		}else if(pNode == null) {	//찾는 부모 노드가 존재하지 않으면
			throw new RuntimeException("해당 부모노드가 존재하지 않습니다");
		}
		
		TreeNode newNode = new TreeNode(data);
		if(pNode.left == null) {
			pNode.left = newNode;
			size++;
		}else if(pNode.right == null) {
			pNode.right = newNode;
			size++;
		}else {
			throw new RuntimeException("해당 부모노드에 자식노드가 꽉 차 있습니다.");
		}
	}

	private TreeNode getNode(TreeNode current, Object data) {
		if(current == null) return null;
		if(current.data.equals(data)) return current;
//		왼쪽 서브트리
		TreeNode temp = getNode(current.left, data);
		if(temp == null) {
//		오른쪽 서브트리
			temp = getNode(current.right, data);
		}
		return temp;
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
		q.add(root);
		while(!q.isEmpty()) {
			size = q.size();
			while(size-->0) {
				TreeNode current = q.remove();
				if(current!=null) {
					System.out.print(current.data+" ");
					if(current.left!=null) { 
						q.add(current.left);
					}
					if(current.right!=null) {
						q.add(current.right);
					}
				}
			}
			System.out.println();
		}
		
	}
}
