package com.ssafy.step1.pretest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_D3_1289_원재의메모리복구2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int t=1;t<=T;++t) {
			char[] input = in.readLine().toCharArray();
			int n = input.length;
			int count=0;
			char[] init = new char[n];
			for(int i=0;i<n;++i) {
				init[i]='0';
			}
			for(int i=0;i<n;++i) {
				if(input[i]==init[i]) continue;
				for(int j=1;j<n;++j) {
						init[j]= input[i];
					}
				
				count++;
				}
			System.out.println("#"+t+" "+count);
			}
						
			
		}
			
}
