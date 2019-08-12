package com.ssafy.step2.tree.linked;

public class TreeNode {
	Object data;
	TreeNode left, right;
	
	public TreeNode(Object data) {
		this.data=data;
	}

	public TreeNode(TreeNode left, Object data, TreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
}
