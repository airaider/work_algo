package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class maze {
	public static int stoi(String s) {
		return Integer.parseInt(s);
		}
	static int N;
	static int x,y,j,M;
	static int dir,dis;
	static int[] dirR= {-1,0,1,0};		
	static int[] dirC= {0,1,0,-1};
	static int[][] map;
	static int a,b;
	static int ans=0;
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		int T=stoi(st.nextToken());
		for(int t=1;t<=T;t++) {
			st = new StringTokenizer(br.readLine());
			N=stoi(st.nextToken());
			x=stoi(st.nextToken());
			y=stoi(st.nextToken());
			j=stoi(st.nextToken());
			map = new int [N][N];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < j; i++) {
				a=stoi(st.nextToken());
				b=stoi(st.nextToken());
				map[a-1][b-1]=1;
			}
			st = new StringTokenizer(br.readLine());
			M=stoi(st.nextToken());
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < M; i++) {
				dir=stoi(st.nextToken());
				dis=stoi(st.nextToken());
				move(dir,dis);
			}
			if(ans==-1) {
				System.out.println("#"+t+" 0 0");
			}
			else {
				System.out.println("#"+t+" "+x+" "+y);

			}
			ans=0;
		}

	}
	private static void move(int r, int s) {
		for(int i=0;i<s;i++) {
			x=dirR[r-1]+x;
			y=dirC[r-1]+y;
			if(x<0 || x>=N || y<0 || y>=N ) {
				ans=-1;
				return;
			}
			if(0<=x && x<N && 0<=y && y<N ) {
				if(map[x][y]==1) {
					ans=-1;
					return;
				}
			}
		}
		
	}
	
	
	
	
}


