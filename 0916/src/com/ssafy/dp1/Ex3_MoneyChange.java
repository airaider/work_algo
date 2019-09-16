package com.ssafy.dp1;

import java.util.Scanner;

public class Ex3_MoneyChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D[] = new int[N+1];
		if(N<=1) {
			System.out.println(1);
			return;
		}
		D[0]=0;
		for (int i = 1; i <= N; i++) {
			if(i<4) {
				D[i]=D[i-1]+1;
			}
			else if(i<6) {
				D[i]=Math.min(D[i-1]+1, D[i-4]+1);
			}
			else {
				if(D[i-1]+1 < D[i-4]+1) {
					D[i]=Math.min(D[i-1]+1, D[i-6]+1);
				}else {
					D[i]=Math.min(D[i-4]+1, D[i-6]+1);
				}
			}
		}
		System.out.println(D[N]);
	}

}
