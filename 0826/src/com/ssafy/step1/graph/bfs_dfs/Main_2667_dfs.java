package com.ssafy.step1.graph.bfs_dfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2667_dfs {
	static int N;
	private static int[][] map;
	static int cnt;
	private static int[][] dir = {
			{1,0},
			{0,1},
			{-1,0},
			{0,-1}
	};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int [N][N];
		for (int i = 0; i < N; i++) {
			String st = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j]=st.charAt(j)-'0';
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j]==1) {
					cnt++;
					dfs(i,j,cnt+1);
				}
			}
		}
		
		int size[] = new int[cnt];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j]>1) {
					size[map[i][j]-2]++;
				}
			}
		}
		System.out.println(cnt);
		Arrays.sort(size);
		for (int i = 0; i < cnt; i++) {
			System.out.println(size[i]);
		}
		
	}
	private static void dfs(int x, int y, int no) {
		int nx=0, ny=0;
		map[x][y]=no;
		
		for (int i = 0; i <4; i++) {
			nx = x+dir[i][0];
			ny = y+dir[i][1];
			if(nx < 0 || nx >=N || ny < 0 || ny >=N) continue;
			if(map[nx][ny]==1) {
				dfs(nx,ny,no);
			}
		}
		
		
	}

}
