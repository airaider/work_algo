package com.ssafy.step1.bit;

public class input_test {

	public static void main(String[] args) {
		String line = "0000000111100000011000000111100110000110000111100111100111111001100111";
		int size = line.length();
		for (int i = 0; i <size; i+=7) {
			System.out.println(line.substring(i, i+7));
			int ans = cal(line.substring(i, i+7));
			System.out.println(ans);
			System.out.println();
		}
		
	}

	private static int cal(String s) {
		int sum=0;
		for(int i=0;i<7;i++) {
			if(s.toCharArray()[i]=='1') sum+=1<<6-i;
		}
		return sum;
	}

}
