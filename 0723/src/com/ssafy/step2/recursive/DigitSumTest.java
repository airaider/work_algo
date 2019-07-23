package com.ssafy.step2.recursive;

import java.util.Scanner;

public class DigitSumTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		
		System.out.println(digit(N,0));
		System.out.println(digit2(N));
		
	}

	private static int digit(int n, int sum) {
		if(n/10==0) return sum+n%10;
		return digit(n/10,sum+n%10);
		
	}
	
	private static int digit2(int n) {
		if(n<10) return n;
		int current = n%10;
		int k=n/10;
		return current+digit2(k);
		
	}

}
