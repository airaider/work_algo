package com.ssafy.step1.permutation;

import java.util.Arrays;

public class BabyginTest {

	static int[][] permutationList;
	static int p;	// 인덱스 순열 리스트의 index
	static int N = 6;
	static int[] numbers, temp;
	
	private static void permutation(int count, int flag) {
		if(count == N) {
			permutationList[p++] = Arrays.copyOf(temp, N);
			System.out.println(Arrays.toString(permutationList[p-1]));
			return;
		}
		
		for(int i=0; i<N; ++i) {
			if((flag & 1<<i) == 0) {
				temp[count] = i;
				permutation(count+1, flag | 1<<i); 
			}
		}
	}
	
	public static void main(String[] args) {

	}

}
