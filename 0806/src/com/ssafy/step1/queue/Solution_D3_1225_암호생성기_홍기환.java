package com.ssafy.step1.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Solution_D3_1225_암호생성기_홍기환 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t=1;t<=10;t++) {
			int T = sc.nextInt();
			Queue<Integer> q = new LinkedList<Integer>();
			for(int i=0;i<8;i++) {
				q.add(sc.nextInt());
			}
			int cnt=0;
			while(!q.isEmpty()) {
				if(cnt==5) {
					cnt=0;
				}
				int f = q.remove();
				int next=f-++cnt;
				if(next<=0) {
					q.add(0);
					break;
				}
				q.add(next);
			}
			System.out.print("#"+t);
			while(!q.isEmpty()) {
				System.out.print(" "+q.remove());
			}
			System.out.println();
		}

	}

}
