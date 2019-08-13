package com.ssafy.step2.permutation.basic;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationTest5 {

	private static int[] numbers;
	private static int N;
	private static int R;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		R=sc.nextInt();
		numbers = new int[R];
		permutation(0,0);
		System.out.println("총 경우의 수 : "+totalCount);
		
	}
	private static int totalCount=0;
	private static void permutation(int index, int flag) {
		
		if(index==R) {
			totalCount++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		// 가능한 선택지에 대해 반복(1~N까지 시도)
		for (int i = 1; i <= N; i++) {
			// 선택지를 사용할 수 있는지 기존수들과 중복체크
			if((flag & 1<<i)==0) { // i가 기존순열안에서 사용되고 있지 않으면
				numbers[index]=i;
				permutation(index+1, flag|1<<i);
			}
		}
	}
}
