package com.ssafy.dp;

import java.util.Arrays;
import java.util.Scanner;

public class MinCoinTest3_DP1 {
	
	static int memo[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D[] = new int[N+1]; // 각 금액을 만들 수 있는 최소 동전 개수 저장할 동적 테이블
		int min;
		
		for (int i = 1; i <= N; i++) {
			min = Integer.MIN_VALUE;
			if(i>=1 && D[i-1]+1<min) min = D[i-1]+1;
			if(i>=4 && D[i-4]+1<min) min = D[i-4]+1;
			if(i>=6 && D[i-6]+1<min) min = D[i-6]+1;
			D[i]=min;
		}
		System.out.println(D[N]);
		
	}
}
