package com.ssafy.step2.shortpath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Dijkstra {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		int[][] adjMatrix = new int[N][N]; // 인접행렬
		boolean[] visited = new boolean[N]; // 정점방문여부
		int[] distance = new int[N]; // 시작정점에서 각 정점까지 이르는 최소비용
		int end = N-1;
		final int INF = Integer.MAX_VALUE;
		Arrays.fill(distance, INF);
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				adjMatrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}//i노드에서 j노드들까지 비용 저장
		
		distance[0]=0; // 출발점 : 0-0까지의 최소비용 0으로 처리

		PriorityQueue<Vertex> q = new PriorityQueue<Vertex>();
		q.offer(new Vertex(0,distance[0]));
		
		while(!q.isEmpty()) {
			Vertex current = q.poll();
			if(visited[current.vertex]) continue;
			visited[current.vertex] = true;
			for (int j = 0; j < N; j++) {
				if(!visited[j]  // 방문하지 않은 j 정점
						&& adjMatrix[current.vertex][j]!=0 // current와 인접해 있는 j정점
						&& current.weight + adjMatrix[current.vertex][j] < distance[j])  // 시작-current-j 비용 < 시작-j비용
					{
						distance[j] = current.weight+adjMatrix[current.vertex][j];
						q.offer(new Vertex(j, distance[j]));
					}
			}
			
		}
//		int min=0,count=0;
//		for (int i = 0; i < N; i++) {
//			// a단계 : 방문하지 않은 정점 중 최소가중치의 정점 선택
//			min = INF;
//			for (int j = 0; j < N; j++) {
//				if(!visited[j] && distance[j]<min) {
//					min = distance[j];
//					current = j;
//				}
//			}
//			visited[current] = true;
//			if(current == end) break;
//			
//			//b단계 : current 정점을 경유지로 하여 갈 수 있는 다른 방문하지 않은 정점들에 대한 고려
//			for (int j = 0; j < N; j++) {
//				if(!visited[j]  // 방문하지 않은 j 정점
//						&& adjMatrix[current][j]!=0 // current와 인접해 있는 j정점
//						&& min + adjMatrix[current][j] < distance[j])  // 시작-current-j 비용 < 시작-j비용
//					{
//						distance[j] = min+adjMatrix[current][j];
//					}
//			}
//			
//		}
		System.out.println(distance[end]);
		
	}
	static class Vertex implements Comparable<Vertex>{
		int vertex;
		int weight;
		public Vertex(int vertex, int weight) {
			super();
			this.vertex = vertex;
			this.weight = weight;
		}
		@Override
		public int compareTo(Vertex arg0) {
			return Integer.compare(this.weight, arg0.weight); // 오름차순
		}
		
	}

}
