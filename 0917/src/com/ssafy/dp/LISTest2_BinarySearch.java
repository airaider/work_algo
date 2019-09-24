package com.ssafy.dp;

import java.util.Arrays;
import java.util.Scanner;

public class LISTest2_BinarySearch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] arr = new int[N];
		int[] LIS = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = s.nextInt();
		}
		
		int size = 0;

        for (int i=0; i < N; i++) {
            int temp = Arrays.binarySearch(LIS, 0, size, arr[i]); 
            temp = Math.abs(temp)-1;
            LIS[temp] = arr[i];
            if (size == temp) {
                size++;
            }
        }
        System.out.println(size);
	}

}
