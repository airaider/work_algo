package com.ssafy.step2.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

import com.ssafy.step2.graph.AdjacentMatrix.Node;

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
	static boolean[] visit;
	static Queue<Integer> q;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		adjList = new Node[N];
		q = new LinkedList<Integer>();
		visit = new boolean[N];
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
	private static void bfs(int current) {
		q.add(current);
		int cnt=0;
		while(!q.isEmpty()) {
			int top = q.remove();
			if(!visit[top]) {
				visit[top]=true;
				cnt++;
				System.out.print((char)(top+'A')+" ");
				for(Node curFriend = adjList[top];curFriend != null;curFriend=curFriend.next) {
//					st.push(curFriend.vertix);
				}
			}
		}
		System.out.println();
		System.out.println(cnt);
		
	}

}
