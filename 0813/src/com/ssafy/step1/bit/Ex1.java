package com.ssafy.step1.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "0000000111100000011000000111100110000110000111100111100111111001100111";
//		String line = br.readLine();
		char[] chars = line.toCharArray();
		int i=0, count=7, size = chars.length;
		
		while(i<size) {
			int number=0;
			for(int j=0; j<count; ++j) {
				if(chars[i+j]=='0') continue;
				number+=(1<<count-1-j);
			}
			System.out.println(number);
			i+=count;
				
		}
	}

}
