package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class robot_sol {
	
	
	
	private static int[][][] direction= {
			{{0,1}},
			{{0,-1},{0,1}},
			{{-1,0},{1,0},{0,-1},{0,1}}
	};

	public static void main(String[] args) throws FileNotFoundException{
		System.setIn(new FileInputStream("input1.txt"));
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=1;t<=T;++t) {
			int N = sc.nextInt();
			char[][] map = new char [N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.next().charAt(0);
				}
			}
			
			int answer = 0;
			int newi, newj=0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int robot = map[i][j] - 'A';
					if(robot>2) continue;	//길이나 벽은 건너뜀
					//로봇의 타입에 맞는 이동
					for(int d=0;d<direction[robot].length;++d) {
						newi=i;
						newj=j;
						while(true) {
							newi+=direction[robot][d][0];
							newj+=direction[robot][d][1];
							if(newi<0 || newi>=N || newj<0 || newj>=N) break;
							if(map[newi][newj]=='S') answer++;
							else break;
						}
					}
				}
			}
			System.out.println("#"+t+" "+answer);
			
		}
	}
	
	
}


