package com.ssafy.step2.subset;

import java.util.Arrays;
import java.util.Scanner;

public class SubSetTest2 {
	static int N;
	static boolean[] selected;
	static int[] arr;
//	1,2,3으로 만들 수 있는 모든 부분집합
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		selected = new boolean[N];
		arr = new int[N];
		makeSubSet(0);
	}

	private static void makeSubSet(int index) {
		if(index==N) {
			for (int i = 0; i < selected.length; i++) {
				System.out.print((selected[i]?(i+1):"X")+"\t");
			}
			System.out.println();
			return;
		}
//		선택
		selected[index] = true;
		makeSubSet(index+1);
//		비선택
		selected[index] = false;
		makeSubSet(index+1);
		
		/*
		for(int i=1;i>=0;--i){
			selected[index] = i%2==1?true:false;
			makeSubSet(index+1);
			}
		}
		 */
		
	}

}
