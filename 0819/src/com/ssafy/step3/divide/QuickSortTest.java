package com.ssafy.step3.divide;

import java.util.Arrays;

public class QuickSortTest {
	private static void quickSort(int[] list, int begin, int end) {
		if(begin<end) { //	집합의 크기(원소개수)가 2이상일 경우만 정렬 시도
			//	피봇위치 확정
			int p = fixPivot(list, begin, end);
			//	피봇왼쪽 집합정렬
			quickSort(list, begin, p-1);
			//	피봇오른쪽 집합정렬
			quickSort(list, p+1, end);
		}
		
	}
	private static int fixPivot(int[] list, int begin, int end) {
		int i,j,pivot;
		i = j = begin;
		pivot = end;
		while(j<end) {
			if(list[j] <= list[pivot]) {
				swap(list,i++,j);
			}
			++j;
		}
		
		swap(list,i,pivot);
		return i;
		
	}
	
	public static void swap(int[] list, int i , int j) {
		int temp = list[i]; 
		list[i] = list[j];
		list[j] = temp;
	}
	
	
	public static void main(String[] args) {
		int [] list = {69,10,30,2,16,8,31,22};
		System.out.println(Arrays.toString(list));
		quickSort(list,0,list.length-1);
		System.out.println(Arrays.toString(list));
	}
}