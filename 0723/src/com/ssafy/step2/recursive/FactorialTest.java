package com.ssafy.step2.recursive;

import java.util.Scanner;

public class FactorialTest {
	
	public static int fac(int n) {
		if (n==1) return 1;
		return n * fac(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(fac(N));
	}

}
