package com.ssafy.step3.sort;

import java.util.Arrays;

public class MergeSortTest {
	
	public static int[] mergeSort(int list[]){
		if(list.length==1) {
			return list;
		}
		int size = list.length;
		int middle = size/2;
		int[] left = new int [middle];
		int[] right = new int [middle]; 
		
		for (int i = 0; i < middle; i++) {
			left[i]=list[i];
		}
		for(int i=middle; i<size; i++) {
			right[i-middle]=list[i];
		}
		left = mergeSort(left);
		right = mergeSort(right);
		
		return merge(left, right);
		
	}
	

	private static int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length+right.length];
		int lc,rc;
		lc = rc = 0;
		int fc=0;
		while(lc<left.length || rc<right.length) {
			if(lc<left.length && rc<right.length) {
				if(left[lc]<=right[rc]) {
					result[fc++]=left[lc++];
				}else {
					result[fc++]=right[rc++];
				}
			}else if(lc<left.length) {
				result[fc++]=left[lc++];
			}
			else if(lc<right.length) {
				result[fc++]=right[lc++];
			}
			
		}
		return result;
		
	}


	public static void main(String[] args) {
		int [] list = {69,10,30,2,16,8,31,22};
		System.out.println(Arrays.toString(list));
		mergeSort(list);
		System.out.println(Arrays.toString(list));
	}

}
