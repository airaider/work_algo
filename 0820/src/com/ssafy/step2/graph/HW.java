package com.ssafy.step2.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class HW {
	static class Node{
		int vertix;
		Node next;
		public Node(int vertix, Node next) {
			super();
			this.vertix = vertix;
			this.next = next;
		}
		@Override
		public String toString() {
			return "Node [vertix=" + vertix + ", next=" + next + "]";
		}
		
	}
	static int N,V;
	static Node[] adjList;
	static int cnt=0;
	static int ans=0;
	static Stack<Integer> st;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		adjList = new Node[N];
		st = new Stack<Integer>();
		V=Integer.parseInt(br.readLine());
		for (int i = 0; i < V; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = st.nextToken().charAt(0)-'A';
			int b = st.nextToken().charAt(0)-'A';
			adjList[a]=new Node(b,adjList[a]);
			adjList[b]=new Node(a,adjList[b]);
		}
		bfs(0);
	}
	private static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		boolean[] visit = new boolean[N];
		int level=1;
		visit[start]=true;
		q.add(start);
		while(!q.isEmpty()) {
			int size = q.size();
			System.out.println("level:"+(level++));
			for (int i = 0; i < size; i++) {
				int f = q.remove();
				System.out.print((char)(f+'A')+ "  ");
				for(Node friend = adjList[f];friend != null;friend=friend.next) {
					if(!visit[friend.vertix]) {
						visit[friend.vertix]=true;
						q.add(friend.vertix);
					}
				}
			}
			System.out.println();
			
		}
	}
	

}