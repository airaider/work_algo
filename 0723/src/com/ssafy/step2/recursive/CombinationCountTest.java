package com.ssafy.step2.recursive;

import java.util.Scanner;

public class CombinationCountTest {

	// n개의 수 중 k개를 조합할 수 있는 경우의 수
	static int[] visit;
	static int N,C;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		C=sc.nextInt();
		visit = new int[N];
		System.out.println(combi(5,2));

	}
	private static int combi(int n, int k) {
		if(n==k || k==0) return 1;
		return combi(n-1,k)+combi(n-1,k-1);
		
	}

//	private static void combi2(int i, int v) {
//		if(v==2 || i==N) {
//			for(int k=0;k<N;k++) {
//				if(visit[k]==1) {
//					System.out.print(k+1);
//				}
//			}
//			System.out.println();
//			return;
//		}
//		visit[i]=1;
//		combi(i+1,v+1);
//		visit[i]=0;
//		combi(i+1,v);
//	}

}
