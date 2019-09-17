package com.ssafy.dp;

import java.util.Arrays;
import java.util.Scanner;

public class MinCoinTest2_Recur2_Memo {
	
	static int memo[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		memo = new int[N+1];
		Arrays.fill(memo, -1);
		System.out.println(change(N));
		
	}

	//money 금액으로 교환해줄수 있는 최소 동전수 리턴
	private static int change(int money) {
		
		if(money == 0) return 0;
		if(memo[money]!=-1) return memo[money];
		
		int min = Integer.MAX_VALUE;
		int temp = 0;
//		1원
		if(money>=1 && (temp = change(money-1)+1)<min) min=temp;
//		4원
		if(money>=4 && (temp = change(money-4)+1)<min) min=temp;
//		6원
		if(money>=6 && (temp = change(money-6)+1)<min) min=temp;
		
		return memo[money]=min;
	}

}
