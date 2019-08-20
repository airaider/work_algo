package com.ssafy.step2.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BabyGin {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int [] num = new int [10];
		for (int i = 0; i < line.length(); i++) {
			num[line.charAt(i)-'0']++;
		}
		System.out.println(Arrays.toString(num));
		int tri=0, run=0;
		for (int i = 0; i < 10; i++) {
			if(num[i]>=3) {
				num[i]-=3;
				tri++;
				i=i-1;
				continue;
			}
			if(num[i]>=1 && num[i+1]>=1 && num[i+2]>=1) {
				num[i]--;
				num[i+1]--;
				num[i+2]--;
				run++;
				i=i-1;
				continue;
			}
		}
		if(tri+run == 2) System.out.println("BABY-GIN");
		else System.out.println("FAIL");
	}

}
