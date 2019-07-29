package com.ssafy.step2.recursive;

import java.util.Arrays;
import java.util.Scanner;

public class baby_gin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int[] input = new int[st.length()];
		for (int i = 0; i < st.length(); i++) {
			input[i]=st.charAt(i)-'0';
		}
		perm(input,0); 
		System.out.println("NOT BABY GIN");

	}
	  public static void perm(int[] arr, int pivot) {
	        
	        if (pivot == arr.length) { 
	        	if(check(arr)) {
	        		System.out.println("BABY GIN!!");
	        		System.exit(0);
	        		System.out.println(Arrays.toString(arr));
		            return;
	        	}
	        	else return;
	            
	        }

	        for (int i = pivot; i < arr.length; i++) {
	            swap(arr, i, pivot);
	            perm(arr, pivot + 1);
	            swap(arr, i, pivot);
	        }

	    }

	    private static boolean check(int[] arr) {
	    	int tri=0;
	    	if(arr[0]==arr[1]) {
	    		if(arr[1]==arr[2]) {
	    			tri++;
	    		}
	    	}
	    	else if(arr[0]!=arr[1])
	    	if(arr[0]+1==arr[1]) {
	    		if(arr[1]+1==arr[2]) {
	    			tri++;
	    		}
	    	}
	    	if(tri==0) {
	    		return false;
	    	}
	    	if(arr[3]==arr[4]) {
	    		if(arr[4]==arr[5]) {
	    			tri++;
	    		}
	    	}
	    	else if(arr[3]!=arr[4])
	    	if(arr[3]+1==arr[4]) {
	    		if(arr[4]+1==arr[5]) {
	    			tri++;
	    		}
	    	}
	    	if(tri==2) return true;
	    	else return false;
		
	}
		public static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }

}
