package com.ssafy.step1.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AdjMatrixTest2 {
	static boolean visited[];
	static int [][] matrix;
	static int totalV;
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		boolean[] visited = new boolean[totalV];
		visited[start] = true;
		System.out.printf(" %c", start+65);
		q.offer(start);
		int current = 0;
		while(!q.isEmpty()) {
			current = q.poll();
			for(int i=0;i<totalV;i++) {
				if(matrix[current][i]==1 && !visited[i]) {
					visited[i]=true;
					System.out.printf(" %c", i+65);
					q.offer(i);
				}
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
		bfs(0);
	}

}

