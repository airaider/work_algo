package com.ssafy.step4.combination;

import java.util.Arrays;
import java.util.Scanner;

public class Dice {
	static int N,M;
	static int dice[];
	static int ans[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		dice = new int[] {1,2,3,4,5,6};
		ans = new int[N];
		switch (M) {
		case 1:
			permutation(0);
			break;
		case 2:
			combination(0,0);
			break;

		case 3:
			three(0,0);
			break;
		default:
			break;
		}
	}
	private static void three(int index,int flag) {
		if(index==N) {
			for (int i : ans) {
				System.out.print(i+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0;i<6;i++) {
			if((flag & 1<<i)==0) {
				ans[index]=dice[i];
				three(index+1, flag|1<<i);
			}
		}
		
	}
	private static void combination(int before, int index) {
		if(index==N) {
			for (int i : ans) {
				System.out.print(i+" ");
			}
			System.out.println();
			return;
		}
		for(int i=before; i<6; ++i ) {
			ans[index] = dice[i];
			combination(i, index+1);
		}
		
		
	}
	private static void permutation(int index) {
		if(index==N) {
			for (int i : ans) {
				System.out.print(i+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<6; ++i) {
			ans[index]=dice[i];
			permutation(index+1);
		}
	}
	
	
}
