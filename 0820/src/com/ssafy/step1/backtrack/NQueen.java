package com.ssafy.step1.backtrack;

import java.util.Scanner;

public class NQueen {
	static int size, ans;
	static boolean [] col;
	static boolean [] slash;
	static boolean [] bslash;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			size = sc.nextInt();
			ans=0;
			col = new boolean[size+1];
			slash = new boolean[2*size+1];
			bslash = new boolean[2*size];
			tryQueen(1);
			System.out.println("#"+t+" "+ans);
		}

	}
	static void tryQueen(int row) {
		
		if(row>size) {
			ans++;
			return;
		}
		
		// 현재 행의 모든 열에 놓아보는 시도
		for (int i = 1; i <= size; i++) {
			if(!col[i]	// 열체크 
					|| slash[row+i]	//좌하향 대각선 체크
							|| bslash[row-i+size]	//우하향 대각선체크
			) continue;	// 불가능한 상황
			
			col[i] = slash[row+i] = bslash[row-i+size] = true;
			tryQueen(row+1);
			col[i] = slash[row+i] = bslash[row-i+size] = false;
		}
	}

}
