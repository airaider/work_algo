package com.ssafy.step2.tree.linked;

import java.util.Scanner;

public class LinkedBinaryTreeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edgeCnt = sc.nextInt()-1;
		LinkedBinaryTree tree = new LinkedBinaryTree();
		while(edgeCnt-->0) {
			tree.add(sc.nextInt(), sc.nextInt());
		}
		tree.printByPreOrder();
		tree.printByInOrder();
		tree.printByPostOrder();
		tree.printByLevelOrder();
	}

}

/*
13
1 2 1 3 2 4 3 5 3 6 4 7 5 8 5 9 6 10 6 11 7 12 11 13
*/
