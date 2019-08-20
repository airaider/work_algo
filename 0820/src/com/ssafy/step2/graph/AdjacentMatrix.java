package com.ssafy.step2.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AdjacentMatrix {
	static class Node{
		int vertix;
		Node next;
		
		Node(int vertix, Node next){
			super();
			this.vertix=vertix;
			this.next=next;
		}
		@Override
		public String toString() {
			return "Node [vertix=" + vertix + ", next=" + next + "]";
		}
	}
	static boolean map[][];
	static Node[] adjList;
	static int N,V;
	static int max=0;
	static char ans;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		map = new boolean[N][N];
		adjList = new Node[N];
		V=Integer.parseInt(br.readLine());
		for (int i = 0; i < V; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = st.nextToken().charAt(0)-'A';
			int b = st.nextToken().charAt(0)-'A';
			map[a][b]=map[b][a]=true;
			adjList[a]=new Node(b,adjList[a]);
			adjList[b]=new Node(a,adjList[b]);
		}
//		System.out.println((char)(goMatrix('A'-'A')+65));
		System.out.println((char)(goList('A'-'A')+65));
		
		
	}
	
	private static int goList(int cur) {
		int MAX = 0, count = 0, MAX_FRIEND=0;
		for(Node curFriend = adjList[cur];curFriend != null;curFriend=curFriend.next) {
			count=0;
			for(Node temp = adjList[curFriend.vertix]; temp!=null;temp=temp.next) count++;
			System.out.println((char)(curFriend.vertix+65)+"의 친구수:"+count);
			if(MAX<count) {
				MAX = count;
				MAX_FRIEND = curFriend.vertix;
			}
		}
		return MAX_FRIEND;
	}
	
	private static int goMatrix(int cur) {
		int MAX = 0, count = 0, MAX_FRIEND=0;
		for (int i = 0; i < N; i++) {
			if(map[cur][i]) {
				count=0;
				for (int j = 0; j < N; j++) {
					if(map[i][j]) count++;
				}
				System.out.println((char)(i+65)+"의 친구수:"+count);
				if(MAX<count) {
					MAX = count;
					MAX_FRIEND = i;
				}
			}
		}
		return MAX_FRIEND;
	}
}