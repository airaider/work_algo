package com.ssafy.step3.permutation.ad;

import java.util.Arrays;

public class NextPermutation {
	static int N, totalCount=0;
	static int[] numbers;
	
	public static void main(String[] args) {
		N=4;
//		시작전제조건 : 가장 작은 순열로 출발(오름차순)
		numbers = new int[] {1,2,3,4,5,6};
		
		do {
			System.out.println(Arrays.toString(numbers));
			totalCount++;
		} while (nextPermutation());
		System.out.println("총 경우의 수 : "+totalCount);
	}

	private static boolean nextPermutation() {
		
//		1. 뒷쪽부터 탐색하며 감소하는 모습을 보이는 시작점(i, 꼭지) 찾기
		int i=N-1;
		while(i>0 && numbers[i-1]>=numbers[i]) --i;
		
//		앞에서 볼때 모두 내림차순되어 있는 상황이어서 가장 큰 순열이므로 다음 순열 없음
		if(i==0) return false;
		
//		2. i-1 위치에 다음에 올 큰 수를 뒤쪽부터 찾기
		int j=N-1;
		while(numbers[i-1]>numbers[j]) --j;
		
//		3. i-1 위치와 j 위치값 교환
		swap(i-1,j);
		
//		4. i-1위치값이 변경되었으므로 뒷자리수(i~j) 재조정(뒷자리수 가장 작은 수열로 만듦==>오름차순)
		j=N-1;
		while(i<j) {
			swap(i++, j--);
		}
		return true;
	}
	
	private static void swap(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}
