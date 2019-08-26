package com.ssafy.step1.graph.bfs_dfs;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main_2667_bfs {
	static int N;
	private static int[][] map;
	private static int[][] dir = {
			{1,0},
			{0,1},
			{-1,0},
			{0,-1}
	};
	private static boolean[][] visit;
	private static Queue<Point> q = new LinkedList<Point>();
	private static PriorityQueue<Integer> ans = new PriorityQueue<Integer>();
	static int count=1;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int [N][N];
		visit = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			String st = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j]=st.charAt(j)-'0';
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j]==1) {
					count++;
					bfs(i,j);
				}
			}
		}
		
		System.out.println(count-1);
		while(!ans.isEmpty()) {
			System.out.println(ans.poll());
		}
		
		
		
	}
	private static void bfs(int a, int b) {
		q.add(new Point(a,b));
		visit[a][b]=true;
		map[a][b]=count;
		int size=0;
		while(!q.isEmpty()) {
			Point p = q.remove();
			size++;
			int x = p.x;
			int y = p.y;
			for (int i = 0; i < 4; i++) {
				int nx = x + dir[i][0];
				int ny = y + dir[i][1];
				if(nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
				if(map[nx][ny]==1 && !visit[nx][ny]) {
					visit[nx][ny]=true;
					map[nx][ny]=count;
					q.add(new Point(nx,ny));
				}
			}
		}
		ans.add(size);
	}
}
