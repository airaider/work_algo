package com.ssafy.hw;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class Main_1809_탑_홍기환 {
	static Stack<link> st;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		st = new Stack<link>();
		st.push(new link(sc.nextInt(), 1));
		System.out.print(0+" ");
		for(int i=1;i<N;i++) {
			int m=sc.nextInt();
			link n=st.peek();	
			while(n.value<=m) {
				st.pop();
				if(!st.isEmpty()) n=st.peek();
				else {
					n.position=0;
					break;
					}
				}
			System.out.print((n.position)+" ");
			st.push(new link(m,i+1));
		}
	}

}
class link{
	int value;
	int position;
	link(int value,int position){
		this.value=value;
		this.position=position;
	}
}
