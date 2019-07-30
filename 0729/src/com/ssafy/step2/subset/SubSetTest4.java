package com.ssafy.step2.subset;

import java.util.Arrays;
import java.util.Scanner;

public class SubSetTest4 {
	static int N;
	static boolean[] selected;
	static int[] numbers;
	static int target_sum;
	static int count;
//	1,2,3으로 만들 수 있는 모든 부분집합
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		target_sum=sc.nextInt();
		numbers=new int[N];
		for (int i = 0; i < N; i++) {
			numbers[i]= sc.nextInt();
		}
		makeSubSet(0,0);
		System.out.println("경우의 수: "+count);
	}

	private static void makeSubSet(int index, int sum) {
		if(sum == target_sum) {
			count++;
			return;
		}
		else if(sum>target_sum) {
			return;
		}
		
		if(index == N) return;
		
		//선택
		makeSubSet(index+1,sum+numbers[index]);
		//비선택
		makeSubSet(index+1, sum);
	}

}
