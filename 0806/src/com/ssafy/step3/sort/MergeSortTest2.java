package com.ssafy.step3.sort;

import java.util.Arrays;

public class MergeSortTest2 {
	
	public static void mergeSort(int list[], int left, int right){
		if(left< right) {
			int middle = (left+right)/2;
			
			mergeSort(list,left,middle);
			mergeSort(list,middle+1,right);
			
			merge(list, left, middle, right);
		}
		
	}
	

	private static void merge(int list[], int left, int middle, int right) {
		int n1 = middle-left+1;
		int n2 = right-middle;
		int[] l = new int[n1];
		int[] r = new int[n2];
		
		for(int i=0;i<n1;i++) {
			l[i]=list[left+i];
		}
		for(int j=0;j<n2;j++) {
			r[j]=list[right+j];
		}
		int i=0,j=0;
		int k=left;
		while(i<n1 && j<n2) {
			if(l[i]<=r[j]) {
				list[k]=l[i];
				i++;
			}else {
				list[k]=r[j];
				j++;
			}
			k++;
		}
		while (i < n1) 
        { 
            list[k] = l[i]; 
            i++; 
            k++; 
        } 
  
        while (j < n2) 
        { 
            list[k] = r[j]; 
            j++; 
            k++; 
        } 
		
		
	}


	public static void main(String[] args) {
		int [] list = {69,10,30,2,16,8,31,22};
		System.out.println(Arrays.toString(list));
		mergeSort(list,0,list.length);
		System.out.println(Arrays.toString(list));
	}

}
