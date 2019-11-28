package com.ssafy.graph.bellman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11657_타임머신 {

	private static int edgeCount;
	private static int INF = Integer.MAX_VALUE;
	private static int count;
	private static int[] distance;
	private static Edge[] edges;
	static class Edge{
		int from,to,time;
		public Edge(int from, int to, int time) {
			super();
			this.from = from;
			this.to = to;
			this.time = time;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		count = Integer.parseInt(st.nextToken());
		edgeCount = Integer.parseInt(st.nextToken());
		distance = new int[count];
		edges = new Edge[edgeCount];
		for (int i = 0; i < edgeCount; i++) {
			st = new StringTokenizer(br.readLine());
			edges[i] = new Edge(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		distance[0]=0;
		goNegativeCycle();
		
	}
	private static boolean goNegativeCycle() {
		for (int i = 0; i <= count; i++) {
			for (Edge e : edges) {
				if(distance[e.from] == INF) continue;
				if(distance[e.from] + e.time < distance[e.to]) {
					distance[e.to] = distance[e.from] + e.time;
					if(i==count) return true;
				}
			}
			
		}
		return false;
	}
	

}
