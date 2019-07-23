package com.ssafy.step2.recursive;

import java.util.Scanner;

public class FibonacciTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println(fibo(N));
		System.out.println(fibo2(N));
		System.out.println(fibo3(N,0,1));
	}

	private static int fibo3(int count, int before, int current) {
		if(count==1) return current;
		return fibo3(--count, current, before+current);	
	}

	private static int fibo2(int n) {
		int first=1;
		int second=1;
		int third = 0;
		if(n<=2) {
			return 1;
		}
		for(int i=3;i<=n;i++) {
			third=second+first;
			first=second;
			second=third;
		}
		return third;

	}

	private static int fibo(int n) {
		if(n==2||n==1) return 1;
		return fibo(n-2)+fibo(n-1);
		
	}

}
