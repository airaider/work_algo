package com.ssafy.hw;

import java.util.Scanner;
import java.util.Stack;

public class Main_1809 {
	static int N;
	static Stack<Integer> st;
	static int arr [];
	static int ans [];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int [N];
		st = new Stack<Integer>();
		for(int i=0;i<N;i++) {
			st.push(sc.nextInt());
		}
		while(!st.isEmpty()) {
			int a = st.pop();
			if(st.peek()>a) {
				System.out.println(st.size());
			}
			else{
				
			}
		}
		
		
	}

}
