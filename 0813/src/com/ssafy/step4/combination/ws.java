package com.ssafy.step4.combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ws {
	static int N,M;
	static int sx,sy;
	static String input,test;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("0001101", 0);
		map.put("0011001", 1);
		map.put("0010011", 2);
		map.put("0111101", 3);
		map.put("0100011", 4);
		map.put("0110001", 5);
		map.put("0101111", 6);
		map.put("0111011", 7);
		map.put("0110111", 8);
		map.put("0001011", 9);
		for(int t=1;t<=T;t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			int flag=1;
			for (int i = 0; i < N; i++) {
				String line = br.readLine();
				for (int j = 0; j < M; j++) {
					if(flag==1 && line.charAt(j)-'0'==1) {
						input=line;
						flag=-1;
					}
				}
			}
			System.out.println();
			System.out.println(input);
			for(int i=0,size=input.length();i<size;i++) {
				if(input.charAt(size-i-1)=='1') {
					test=input.substring(size-i-1-56, size-i-1);
					break;
				}
			}
			System.out.println(test);
			for (int i = 0; i < 8; i++) {
				System.out.println(test.substring(7*i, 7*i+7));
			}
			
		}
	}

}
