package com.ssafy.step3.dfs;

import java.util.Stack;

public class AdjMatrixTest2 {
	static boolean visited[];
	static int [][] matrix;
	static int totalV;
	public static void dfs(int current) {
		visited[current] = true;
		System.out.printf(" %c", current+65);
		for (int i = 0; i < totalV; i++) {
			if(matrix[current][i]==1 && !visited[i]) {
				dfs(i);
			}
		}
		
	

	}

	public static void main(String[] args) {
		totalV = 7;
		matrix = new int [][] {
				{0,1,1,0,0,0,0},
				{1,0,0,1,1,0,0},
				{1,0,0,0,1,0,0},
				{0,1,0,0,0,1,0},
				{0,1,1,0,0,1,0},
				{0,0,0,1,1,0,1},
				{0,0,0,0,0,1,0},
		};
		visited=new boolean[totalV];
		dfs(0);
	}

}

