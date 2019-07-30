package com.ssafy.step3.dfs;

import java.util.Stack;

public class AdjMatrixTest {

	static int [][] matrix;
	static int totalV;
	static boolean visited[];
	public static void dfs() {
		Stack<Integer> st=new Stack<Integer>();
		visited=new boolean[totalV];
		int current =0;
		visited[current]=true;
		System.out.printf(" %c", current+65);
		
		do{
			for (int i = 0; i < totalV; i++) {
				if(matrix[current][i]==1 && !visited[i]) {
					st.push(current);
					current = i;
					visited[current] = true;
					System.out.printf(" %c", current+65);
					i=-1;
				}
			}

		}
		while(!st.isEmpty() && (current=st.pop()) != -1);
		
		
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
		dfs();
	}

}

