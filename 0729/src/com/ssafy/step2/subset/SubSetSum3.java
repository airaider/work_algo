package com.ssafy.step2.subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubSetSum3 {
	static int N;
	static boolean[] selected;
	static int[] arr;
	static int target;
	static ArrayList<Integer> ar;
//	1,2,3으로 만들 수 있는 모든 부분집합
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ar = new ArrayList<Integer>();
		System.out.println("size:");
		N = sc.nextInt();
		System.out.println("target sum:");
		target = sc.nextInt();
		System.out.println("input array:");
		for(int i=0;i<N;i++) {
			ar.add(sc.nextInt());
		}
		
		ar.toString();
		System.out.println(ar.toString());
		selected = new boolean[ar.size()];
		arr = new int[N];
		makeSubSet(0);
	}

	private static void makeSubSet(int index) {
		if(index==N) {
			int sum=0;
			for (int i = 0; i < selected.length; i++) {
				if(selected[i]) {
					System.out.print(ar.get(i)+"\t");
					sum+=ar.get(i);
				}
				else System.out.print("X"+"\t");
			}
			if(sum==target) System.out.print("sum");
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
