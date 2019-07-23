package com.ssafy.step2.recursive;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class hanoi {
	static BufferedWriter bw;
	public static void main(String[] args) throws IOException {
		Scanner br = new Scanner(System.in);
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = br.nextInt();
		System.out.println((int)Math.pow(2, N)-1);
		if(N>20) {
			hanoi1(N,1,2,3);
		}
		else hanoi(N,1,2,3);
		
		bw.flush();
		bw.close();
	}

	private static void hanoi1(int n, int from, int by, int to) {
		if(n==1) {
			return;
		}
		else {
			hanoi1(n-1,from,to,by);
			hanoi1(n-1,by,from,to);
		}
		
	}

	private static void hanoi(int n, int from, int by, int to) throws IOException {
		if(n==1) {
			bw.write(from+" "+to+'\n');
			return;
		}
		else {
			hanoi(n-1,from,to,by);
			bw.write(from+" "+to+'\n');
			hanoi(n-1,by,from,to);
		}
		
	}

}
