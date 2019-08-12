package com.ssafy.step1.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		for(int t=1;t<=10;t++) {
			int ans=1;
			int N = Integer.parseInt(br.readLine());
			BinaryTree tree = new BinaryTree(N);
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				if(st.countTokens()==4) continue;
				if(st.countTokens()==2) {
					st.nextToken();
					try {
						int c=Integer.parseInt(st.nextToken());
					} catch (Exception e) {
						ans=0;
					}
					
					
				}
			}
			System.out.println("#"+t+" "+ans);
			
		}
		
	}
}

