package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ladder1 {
	static int[][] map;
	static boolean[][] visit;
	static int[][] dir = {
			{0,1},
			{0,-1},
			{1,0}
	};
	static int flag;
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("ladder_input.txt"));
		Scanner sc = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++) {
			flag=-1;
			int T=sc.nextInt();
			map = new int[100][100];
			
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					map[i][j]=sc.nextInt();
				}
			}
			for (int i = 0; i < 100; i++) {
				if(map[0][i]==1) {
					visit = new boolean[100][100];
					visit[0][i]=true;
					ladder(0,i);
					if(flag>0) {
						System.out.println("#"+T+" "+i);
						break;
					}
				}
			}
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					if(map[i][j]==2) {
					}
				}
			}
		}
		
		

	}
	private static void ladder(int x, int y) {
		int nx;
		int ny;
		for (int i = 0; i < 3; i++) {
			nx=x+dir[i][0];
			ny=y+dir[i][1];
			
			if(0<=nx && nx<100 && 0<=ny && ny<100) {
				if(map[nx][ny]==2) {
					flag=1;
					return;
				}
				if(map[nx][ny]==1 && !visit[nx][ny]) {
					visit[nx][ny]=true;
					ladder(nx,ny);
					return;
				}
			}
		}
		
		
	}

}
