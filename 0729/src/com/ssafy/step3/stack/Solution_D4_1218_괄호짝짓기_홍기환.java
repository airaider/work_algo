package com.ssafy.step3.stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution_D4_1218_괄호짝짓기_홍기환 {

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
					st.push('(');
					break;
				case '{':
					st.push('{');
					break;
				case '[':
					st.push('[');
					break;
				case '<':
					st.push('<');
					break;
				case ')':
					if(st.peek()=='(') st.pop();
					else flag=0;
					break;
				case '}':
					if(st.peek()=='{') st.pop();
					else flag=0;
					break;
				case ']':
					if(st.peek()=='[') st.pop();
					else flag=0;
					break;
				case '>':
					if(st.peek()=='<') st.pop();
					else flag=0;
					break;
				}
				if(flag!=1) {
					break;
				}
			
				}
		System.out.println("#"+t+" "+flag);
	}	
		}
	}


