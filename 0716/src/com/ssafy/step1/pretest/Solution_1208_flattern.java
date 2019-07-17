package com.ssafy.step1.pretest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1208_flattern {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(int t=1;t<=10;++t) {
			int T = Integer.parseInt(in.readLine());
			String[] str = in.readLine().split(" ");
			int size = str.length;
		    int [] arr1 = new int [size];
		    for(int j=0; j<size; ++j) {
		         arr1[j] = Integer.parseInt(str[j]);
		    }
		    Arrays.sort(arr1);
		    for(int i=0;i<T;++i) {
		    	arr1[99]-=1;
		    	arr1[0]+=1;
		    	Arrays.sort(arr1);
		    }
		    int ans = arr1[99]-arr1[0];
		    System.out.println("#"+t+" "+ans);
		    

		}

}
}
