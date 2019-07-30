package com.ssafy.step2.memorization;

import java.util.Scanner;

public class FibonacciTest {
	static int memo[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		memo = new int [N+1];
		memo[1]=1;
		memo[2]=1;
		System.out.println(fibonacci(N));
		
	}

	private static int fibonacci(int n) {
		if(n>2 && memo[n] == 0) memo[n] = fibonacci(n-2) + fibonacci(n-1);
		return memo[n];
	}

}
