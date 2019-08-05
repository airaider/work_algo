package com.ssafy.ws;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Solution_D4_1224_계산기3_홍기환 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=1;t<=10;t++) {
			Stack<Character> st = new Stack<Character>();
			LinkedList<Character> line = new LinkedList<Character>();
			int N= sc.nextInt();
			sc.nextLine();
			String input=sc.nextLine();
			for(int i=0;i<N;i++) {
				char c = input.charAt(i);
				switch (c) {
				case '(':
					st.push(c);
					break;
				case ')':
					if(!st.isEmpty()) {
						while(st.peek()!='(') {
							line.add(st.pop());
						}
						st.pop();
					}
					break;
				case '+':
					if(!st.isEmpty() ) {
						while(!st.isEmpty()&& st.peek()!='(') {
							line.add(st.pop());
						}
						st.push(c);
					}
					else {
						st.push(c);
					}
					break;
				case '*':
					st.push(c);
					break;

				default:
					line.add(c);
					break;
				}
			}
			while(!st.isEmpty()) {
				if(st.peek()!='(') {
					line.add(st.pop());
				}
				else st.pop();
		
			}
			Stack<Integer> st1 = new Stack<Integer>();
			
			int num1=0;
			int num2=0;
			int k =line.size();
			for(int i=0;i<k;i++) {
				char testCh = line.get(i);
				if(testCh=='+' || testCh=='*'){
	                num2 = st1.pop();
	                num1 = st1.pop();
	                
	                switch(testCh){
	                case '+' :
	                    st1.push(num1+num2);
	                    break;
	                case '*' :
	                    st1.push(num1*num2);
	                    break;
	                }
	            }else{
	                st1.push(testCh-'0');
	            }

				
			}
			System.out.println("#"+t+" "+st1.pop());
			
			
		}
	}

}
