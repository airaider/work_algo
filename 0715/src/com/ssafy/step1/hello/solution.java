package com.ssafy.step1.hello;

import java.util.Scanner;

public class solution {
	private static Scanner scan;
	private static int count;
	private static int t;
	private static int[] array;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);  
		t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++) {
			count=0;
			String input = scan.nextLine();
			array = input.chars().map(q->q-'0').toArray();
			for(int j=0;j<array.length;j++) {
				if(array[j]==1) {
					for(int k=j;k<array.length;k++) {
						if(array[k]==1) {
							array[k]=0;
						}
						else {
							array[k]=1;
						}
					}
				count+=1;
				}
				
			}
			System.out.println("#"+(i+1)+" "+count);
			
		}
		

		
	}
	
}
