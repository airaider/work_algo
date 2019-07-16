package com.ssafy.step1.pretest;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_D3_1289_원재의메모리복구 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
//		nextline 사용시에는 공백 하나를 제거해줘야한다
//		sc.nextLine();
//		for(int t=1;t<=T;++t) {
//			char[] input = sc.nextLine().toCharArray();
//			System.out.println(Arrays.toString(input)); 
//		}
		
		
		for(int t=1;t<=T;++t) {
			char[] input = sc.next().toCharArray();
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
