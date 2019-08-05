package com.ssafy.hw;

import java.util.Scanner;

public class Main_1175_주사위던지기2_홍기환 {
	static int N,M;
	static int[] dice;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		int sum=0;
		set(0,0,"");
		
	}
	private static void set(int index, int sum, String result) {
		if(index == N) {
			if(sum == M) {
				System.out.println(result);
				return;
			}
			return;
		}
		if(sum+(6*(N-index))<M){
			return;
		}
		
		if(sum>M) {
			return;
		}
		
		
		
		for(int i=1;i<=6;i++) {
			set(index+1,sum+i,result+i+" ");
		}
	}
	

}