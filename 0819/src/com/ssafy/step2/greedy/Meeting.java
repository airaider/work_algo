package com.ssafy.step2.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Meeting {
	static boolean vis[];
	static boolean ans[];
	static int N;
	static int max = 0;
	static int maxtime = 0;
	static ArrayList<meet> arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new ArrayList<meet>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			int n = i;
			int s = Integer.parseInt(st.nextToken());
			int f = Integer.parseInt(st.nextToken());
			if(f>maxtime) maxtime=f;
			arr.add(new meet(n,s,f));
		}
		vis=new boolean[N];
		dfs(0);
		for (int i = 0; i < N; i++) {
			if(ans[i]) {
				System.out.print((i+1)+" ");
			}
		}
		
	}
	private static void dfs(int index) {
		
		if(index==N) {
			int cnt=0;
			boolean[] check = new boolean[maxtime+1];
			for (int i = 0; i < N; i++) {
				if(vis[i]) {
					int x = arr.get(i).start;
					int y = arr.get(i).fin;
					for (int j = x; j <= y; j++) {
						if(check[j]) return;
						check[j]=true;
					}
					cnt++;
				}
			}
			
			if(cnt>max) {
				max=cnt;
				ans=new boolean[N];
				for (int i = 0; i < N; i++) {
					if(vis[i]) {
						ans[i]=vis[i];
					}
				}
			}
			return;
		}
		
		vis[index]=true;
		dfs(index+1);
		vis[index]=false;
		dfs(index+1);
		
	}

}
class meet{
	int num;
	int start;
	int fin;
	meet(int num, int start, int fin){
		this.num = num;
		this.start = start;
		this.fin = fin;
	}
}


/*

10
1 4 1 6 6 10 5 7 3 8 5 9 3 5 8 11 2 13 12 14


*/
