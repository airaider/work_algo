package com.ssafy.dp;

import java.util.Scanner;

public class MinCoinTest3_DP2 {
	
	static int memo[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D[][] = new int[3][N+1]; // 각 단위를 고려하여 금액을 만들 수 있는 최소 동전 개수 저장할 동적 테이블
		int[] coin = {1,4,6};
		
		for (int j = 1; j <= N; j++) {
			D[0][j]=1;
		}
		for (int i = 1; i < 3; i++) { // 4원, 6원동전을 차례대로 고려
			for (int j = 1; j <= N; j++) {
				if(coin[i] <= j) { // 현동전으로 j금액을 만들 수 있다면 (사용해보는 경우, 사용해보지 않는 경우 중 최적해)
					D[i][j]=Math.min(D[i][j-coin[i]]+1, D[i-1][j]);
				}else { // 현 동적으로 j금액을 만들 수 없다면
					D[i][j] = D[i-1][j];
				}
			}
		}
		System.out.println(D[2][N]);
	}
}
