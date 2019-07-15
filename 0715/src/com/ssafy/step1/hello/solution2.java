	package com.ssafy.step1.hello;
	
	import java.util.Arrays;
	import java.util.Scanner;
	
	public class solution2 {
		private static Scanner scan;
		private static int max_cal;
		private static int m;
		private static int max;
		private static int t;
		private static int[] taste;
		private static int[] kal;
		private static boolean[] visited;
		
		
		public static void main(String[] args) {
			scan = new Scanner(System.in);  
			t=scan.nextInt();
			for(int k=0;k<t;k++) {
				m=scan.nextInt();
				max_cal=scan.nextInt();
				max=0;
				taste = new int[m];
				kal = new int[m];
				for(int i=0;i<m;i++) {
					taste[i]=scan.nextInt();
					kal[i]=scan.nextInt();
				}
				visited=new boolean[m];
				Arrays.fill(visited,false);
				int cal = 0;
				dfs(0,cal,0);


				System.out.println("#"+(k+1)+" " +max);
				
				
			}
			
			
		}
		private static void dfs(int c, int cal, int happy) {
			if(cal<=max_cal) {
				System.out.println(cal);
				if(happy>max) {
					max=happy;
				}
			}
			else if(cal>max_cal) {
				return;
			}
			for(int i=c;i<m;i++) {
				dfs(c+1,cal,happy);
				cal+=kal[c];
				happy+=taste[c];
			}
		}
		
		
	}
