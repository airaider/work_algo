package com.ssafy.step2.recursive;

import java.util.Scanner;

public class StarPrintTest {
	
	// 정수 N 입력받고
	// N:3 
	// *
	// **
	// ***
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		star(N);
	}

	private static void star(int n) {

		// 맨 아래단을 제외한 직각삼각형 찍기
		// 맨 아래단 N개 '*'찍기
		if(n==0) return;
		star(n-1);
		for(int i=0;i<n;i++) {
			System.out.printf("*");
		}
		System.out.println();
	}
//	N-1개 만큼 삼걱형 만들기
//	N개만큼 별찍고 줄바꿈
}
