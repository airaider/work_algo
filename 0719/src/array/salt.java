package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class salt {
	public static int stoi(String s) {
		return Integer.parseInt(s);
		}
	static int N;
	static int[][] map;
	static int salt;
	static int count;
	static int ans;
	static int x,y,dir;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T=stoi(st.nextToken());
		for(int t=1;t<=T;t++) {
			count=0;
			int c=0;
			int flag=0;
			ans=0;
			st = new StringTokenizer(br.readLine());
			N=stoi(st.nextToken());
			map = new int [N][N];
			salt=stoi(st.nextToken());
			for (int i = 0; i < salt; i++) {
				++count;
				st = new StringTokenizer(br.readLine());
				x=stoi(st.nextToken());
				y=stoi(st.nextToken());
				dir=stoi(st.nextToken());
				jump();
				if(ans!=0 && flag==0) {
					flag=ans;
				}
			}
			System.out.println("#"+t+" "+flag);

		}

	}
	private static void jump() {
		map[x][y]=1;
		if(dir==2) {
			for(int i=3;i>0;i--) {
				y=y+i;
				if(y<0 || y>=N) {
					return;
				}
				if(map[x][y]!=0) {
					ans=count;
					return;
				}
				map[x][y]=1;
			}
		}
		if(dir==1) {
			for(int i=3;i>0;i--) {
				x=x+i;
				if(x<0 || x>=N) {
					return;
				}
				if(map[x][y]!=0) {
					ans=count;
					return;
				}
				map[x][y]=1;
			}
		}
		
	}
	
	
	
}


