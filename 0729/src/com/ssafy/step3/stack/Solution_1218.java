package com.ssafy.step3.stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution_1218 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=1;t<=10;t++) {
			int flag=1;
			int N = sc.nextInt();
			sc.nextLine();
			Stack<Character> st = new Stack<Character>();
			String str = sc.nextLine();
			for(int j=0;j<N;j++) {
				char c = str.charAt(j);
				switch (c) {
				case '(':
				case '{':
				case '[':
				case '<':
					st.push(c);
					break;
				case ')':
					if(!st.isEmpty() && st.pop()=='(') continue;
					else flag=0;
					break;
				case '}':
					if(!st.isEmpty() && st.pop()=='{') continue;
					else flag=0;
					break;
				case ']':
					if(!st.isEmpty() && st.pop()=='[') continue;
					else flag=0;
					break;
				case '>':
					if(!st.isEmpty() && st.pop()=='<') continue;
					else flag=0;
					break;
				}
				if(flag!=1) break;
				
				}
		System.out.println("#"+t+" "+flag);
		}	
	}
}


