package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class salt2 {
	public static int stoi(String s) {
		return Integer.parseInt(s);
		}
	static int N;
	static int[][] dir= {
			{1,0},
			{0,1}
	};
	static int[][] map;
	static int count;
	static int ans;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T=stoi(st.nextToken());
		for(int t=1;t<=T;t++) {
			count=0;
			int flag=0;
			ans=0;
			st = new StringTokenizer(br.readLine());
			N=stoi(st.nextToken());
			map = new int [N][N];
			int salt=stoi(st.nextToken());
			for (int i = 0; i < salt; i++) {
				++count;
				st = new StringTokenizer(br.readLine());
				int a=stoi(st.nextToken());
				int b=stoi(st.nextToken());
				int c=stoi(st.nextToken());
				jump(a,b,c);
				if(ans!=0 && flag==0) {
					flag=ans;
				}
			}
			System.out.println("#"+t+" "+flag);

		}

	}
	private static void jump(int x, int y, int d) {
		map[x][y]=1;
		int nx=x;
		int ny=y;
		for(int i=3;i>=1;i--) {
			nx=nx+(dir[d-1][0])*i;
			ny=ny+(dir[d-1][1])*i;
			if(nx<0 || nx>=N || ny<0 || ny>=N) {
				return;
			}
			if(map[nx][ny]!=0) {
				ans=count;
				return;
			}
			map[nx][ny]=1;
		}
		
		
	}
	
	
	
}

