package com.ssafy.step1.hello;

import java.util.Arrays;
import java.util.Scanner;

public class HelloTest {

	private static Scanner scan;
	private static int T;
	private static int LIS[] = null;
	private static int INF = Integer.MAX_VALUE;
	
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);  
		//message = scan.nextLine();   
		//kilometer = scan.nextInt();   
		T = scan.nextInt();
		
		
		for(int y=0;y<T;y++) {
			int N;
			N = scan.nextInt();
			int[] arr = new int[N];
			for(int j=0;j<N;j++) {
				arr[j] = scan.nextInt();
				
			}
			
			LIS=new int[N];
			Arrays.fill(LIS,INF);
			int len = 1;
			LIS[0] = arr[0];
			for (int i = 1 ; i < N ; i++) {
				
				if (LIS[len - 1] < arr[i]) {
					LIS[len++] = arr[i];
					continue;
				}
				
				int idx = Arrays.binarySearch(LIS, arr[i]);
				if (idx < 0) {
					idx = -(idx + 1);
					LIS[idx] = arr[i];
				} 
			}
			
			
			System.out.println("#"+(y+1)+" " +len);
		}
		
		
		
	}


	

}
