package com.ssafy.step3.sort;

import java.util.Arrays;

public class InsertionSortTest {
	
	public static void insertionSort(int list[]) {
		final int SIZE = list.length;
		for (int i = 1; i < SIZE; ++i) {
			int temp = list[i];
			for (int j = 0; j < i; j++) {
				if(temp<list[j]) { //삽입 포인트
					for (int k = i-1; k >= j ; k--) { 
						//s집합 끝부터 하나씩 삽입위치 원소까지 뒤로 이동
						list[k+1] = list[k];
					}
					list[j]=temp;
					break;
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		int [] list = {69,10,30,2,16,8,31,22};
		System.out.println(Arrays.toString(list));
		insertionSort(list);
		System.out.println(Arrays.toString(list));
		
		
		
	}

}
