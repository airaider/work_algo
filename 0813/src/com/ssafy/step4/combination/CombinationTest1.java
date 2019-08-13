package com.ssafy.step4.combination;

import java.util.Arrays;
import java.util.Scanner;

//nCr : 1-N까지의 수 중 r새를 추출(순서 무관)
public class CombinationTest1 {
	
	static int N,R,numbers[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		R=sc.nextInt();
		numbers = new int[R];
		combination(0,0);
	}
	
	private static void combination(int before, int index) {
		if(index==R) {
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		for(int i=before+1; i<=N; ++i ) {
			numbers[index] = i;
			combination(i, index+1);
		}
		
		
	}
	
}
	
