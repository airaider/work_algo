package com.ssafy.step1.permutation;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationTest3 {

	private static int[] numbers;
	private static boolean[] selected;
	private static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		numbers = new int[N];
		selected = new boolean[N+1];
		permutation(0);
		System.out.println("총 경우의 수 : "+totalCount);
		
	}
	private static int totalCount=0;
	private static void permutation(int index) {
		
		if(index==N) {
			totalCount++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		// 가능한 선택지에 대해 반복(1~N까지 시도)
		for (int i = 1; i <= N; i++) {
			// 선택지를 사용할 수 있는지 기존수들과 중복체크
			if(!selected[i]) {
				selected[i]=true;
				numbers[index]=i;
				permutation(index+1);
				selected[i]=false;
			}
		}
	}
}
