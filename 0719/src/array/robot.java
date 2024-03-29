package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class robot {
	public static int stoi(String s) {
		return Integer.parseInt(s);
		}
	static int N;
	static int[] dirR= {-1,1,0,0};		
	static int[] dirC= {0,0,-1,1};
	static char[][] map;
	static int count=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T=stoi(st.nextToken());
		for(int t=1;t<=T;t++) {
			count=0;
			st = new StringTokenizer(br.readLine());
			N=stoi(st.nextToken());
			map = new char [N][N];
			for (int i = 0; i < N; i++) {
				String a = br.readLine();
				for (int j = 0; j < N; j++) {
					map[i][j]=a.charAt(j*2);
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(map[i][j]=='A') {
						mover(i,j);
					};
					if(map[i][j]=='B') {
						mover(i,j);
						movel(i,j);
					}
					if(map[i][j]=='C') {
						mover(i,j);
						movel(i,j);
						moved(i,j);
						moveu(i,j);
					}
				}
			}
			System.out.println("#"+t+" "+count);

		}

	}
	
	private static void mover(int x, int y) {
		
		int nr = x;
		int nc = y+1;
		if(0<=nr && nr<N && 0<=nc && nc<N ) {
			if(map[nr][nc]=='S') {
				count++;
				mover(nr,nc);
			}
		}
		
		
		
	}
	private static void movel(int x, int y) {
		
		int nr = x;
		int nc = y-1;
		if(0<=nr && nr<N && 0<=nc && nc<N ) {
			if(map[nr][nc]=='S') {
				count++;
				movel(nr,nc);
			}
		}
		
		
	}
	private static void moveu(int x, int y) {
		
		int nr = x-1;
		int nc = y;
		if(0<=nr && nr<N && 0<=nc && nc<N ) {
			if(map[nr][nc]=='S') {
				count++;
				moveu(nr,nc);
			}
		}
		
		
	}
	private static void moved(int x, int y) {
		
		int nr = x+1;
		int nc = y;
		if(0<=nr && nr<N && 0<=nc && nc<N ) {
			if(map[nr][nc]=='S') {
				count++;
				moved(nr,nc);
			}
		}
		
		
	}
	
	
}


