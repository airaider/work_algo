package com.ssafy.algo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution32 {
	static int Y,X,N;
	static int py,px,pn;
	static int [][] map;
	static int [][] player;
	static boolean [][] visit;
	static int mon=0;
	static int[][] direction = {
			{0,1},
			{1,0},
			{0,-1},
			{-1,0}
	};
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=1;t<=T;t++) {
			mon=0;
			Y=sc.nextInt();
			X=sc.nextInt();
			N=sc.nextInt();
			
			map = new int [Y][X];
			player = new int [Y+1][X+1];
			visit = new boolean [Y][X];
			for (int i = 0; i < Y; i++) {
				for (int j = 0; j < X; j++) {
					map[i][j]=sc.nextInt();
				}
			}
			for (int i = 0; i < N; i++) {
				py=sc.nextInt();
				px=sc.nextInt();
				pn=sc.nextInt();
				player[py][px]=pn;
			}
			int tnum=sc.nextInt();
			for (int i = 0; i < tnum; i++) {
				int ty=sc.nextInt();
				int tx=sc.nextInt();
				map[ty-1][tx-1]=0;					
			}
			for (int i = 1; i <= Y; i++) {
				for (int j = 1; j <= X; j++) {
					if(player[i][j]!=0) {
						jump(i,j,player[i][j]);
					}
				}
			}
			
			System.out.println("#"+t+" "+(mon-(1000*N)));
			
		}


	}
	private static void jump(int a, int b, int c) {
		int x=a-1;
		int y=b-1;
		for (int i = 0; i < c; i++) {
			int num=map[x][y];
			int dir=num/10;	//방향
			int dis=num%10; //정도
			x=x+(direction[dir-1][0])*dis;
			y=y+(direction[dir-1][1])*dis;
			if(0<=x && x<Y && 0<=y && y<X) {
				
				if(map[x][y]==0) {
					return;
				}
			}
			else {
				return;
			}
		}
		mon+=map[x][y]*100;
		
		

	}
	
}