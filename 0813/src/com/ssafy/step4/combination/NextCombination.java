package com.ssafy.step4.combination;

import java.util.Arrays;

public class NextCombination {
	
	static int N,R,totalCount;
	static int[] numbers, selected;
	
	public static void main(String[] args) {
		N=5;
		R=3;
		numbers = new int[] {1,2,3,4,5};
		selected = new int[] {0,0,1,1,1};
		combination();
		
	}

	private static void combination() {
		do {
			for(int i=0;i<N;i++) {
				if(selected[i]==1) System.out.print(numbers[i]+" ");
			}
			System.out.println();
		} while (nextCombination());
		System.out.println("총 경우의 수 : "+totalCount);
	}

	private static boolean nextCombination() {
		++totalCount;
		int i=N-1;
		while(i>0 && selected[i-1]>=selected[i]) --i;
		
		if(i==0) return false;
		
		int j=N-1;
		while(selected[i-1]>=selected[j]) --j;
		
		swap(i-1,j);
		
		j=N-1;
		while(i<j) {
			swap(i++, j--);
		}
		return true;
	}
	
	private static void swap(int i, int j) {
		int temp = selected[i];
		selected[i] = selected[j];
		selected[j] = temp;
	}
}
