package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q1_sol {
	static char[][] map;
	static int N;
	static int max=2;
	static int[] dix= {-1,1,0,0,1,1,-1,-1};		
	static int[] diy= {0,0,-1,1,1,-1,1,-1};
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("test2.txt"));
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=1;t<=T;t++) {
			max=2;
			N=sc.nextInt();
			map = new char [N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.next().charAt(0);
				}
			}//map input
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(map[i][j]=='B') {
						check(i,j);
					}
				}
			}
			System.out.println("#"+t+" "+max);
		}//testcase

	}
	private static void check(int x, int y) {
		int G=0;
		int B=0;
		for (int i = 0; i < 8; i++) {
			int nx=x+dix[i];
			int ny=y+diy[i];
			if(0<=nx && nx<N && 0<=ny && ny<N ) {
				if(map[nx][ny]=='B') {
					B++;
				}
				if(map[nx][ny]=='G') {
					G++;
				}
				
			}
		}
		if(G==0) {
			int height=0;
			for(int i=0;i<N;i++) {
				if(map[i][y]=='B') height++;
			}
			for(int i=0;i<N;i++) {
				if(map[x][i]=='B') height++;
			}
			if(height>max) {
				max=height-1;
			}
		}
		
		
	}
	

}
