package com.ssafy.dp;

import java.util.Scanner;

public class MinCoinTest1_Recur {
	
	static int MIN = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		change(N,0);
		System.out.println(MIN);
	}

	private static void change(int money, int count) {
		
		if(money<0) return;
		if(money==0) {
			if(count<MIN) MIN=count;
			return;
		}
		
//		1원
		if(money>=1) change(money-1, count+1);
//		4원
		if(money>=4) change(money-4, count+1);
//		6원
		if(money>=6) change(money-6, count+1);
		
		
	}

}
