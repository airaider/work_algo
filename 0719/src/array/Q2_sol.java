package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q2_sol {
	static int N;
	static int salt,ans;
	static int a,b,d;
	static boolean[][] map;
	static int[][] dir= {
			{-1,0},
			{1,0},
			{0,-1},
			{0,1},
	};
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("test2.txt"));
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=1;t<=T;t++) {
			N=sc.nextInt();
			salt=sc.nextInt();
			ans=salt;
			map = new boolean [N][N];
			for(int i=0;i<salt;i++) {
				a=sc.nextInt();
				b=sc.nextInt();
				d=sc.nextInt();
				jump(a,b);
			}
			System.out.println("#"+t+" "+ans);
		}
	}
	private static void jump(int x, int y) {
		for (int i = 3; i >= 1; i--) {
			x=x+((dir[d-1][0])*i);
			y=y+((dir[d-1][1])*i);
			if(x<0 || x>=N || y<0 || y>=N) {
				ans--;
				return;
			}
			if(map[x][y]==true) {
				ans--;
				return;
			}
		}
		map[x][y]=true;
		
	}

}
