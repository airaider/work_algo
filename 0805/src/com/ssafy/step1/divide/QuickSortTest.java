package com.ssafy.step1.divide;

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
		int pivot, left, right, temp;
		pivot = begin;	//맨 왼쪽 값을 pivot값으로 사용
		left = begin+1;
		right = end;
		
		do {
			//left : 피봇보다 같거나 큰 값 찾아 움직임(작으면 계속 오른쪽으로..)
			while (left < end && list[left] < list[pivot]) {
				left++;
			}
			//right : 피봇보다 작은 값을 찾아 움직임(같거나 크면 계속 왼쪽으로..)
			while (right > begin && list[right] >= list[pivot]) {
				right--;
			}
			if (left < right) {
				temp = list[left];
				list[left] = list[right];
				list[right] = temp;
			} 
		} while (left<right);
		
		temp = list[pivot];
		list[pivot] = list[right];
		list[right] = temp;
		
		return right;
	}
	public static void main(String[] args) {
		int [] list = {69,10,30,2,16,8,31,22};
		System.out.println(Arrays.toString(list));
		quickSort(list,0,list.length-1);
		System.out.println(Arrays.toString(list));
	}
}