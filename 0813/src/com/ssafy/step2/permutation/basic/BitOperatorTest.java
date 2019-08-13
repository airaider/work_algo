package com.ssafy.step2.permutation.basic;

public class BitOperatorTest {
	public static void main(String[] args) {
		int i=1, j=6;
		System.out.println("i:"+Integer.toBinaryString(i));
		System.out.println("j:"+Integer.toBinaryString(j));
		System.out.println("1<<2 : "+Integer.toBinaryString(1<<2));
		System.out.println("j&(1<<2) : "+Integer.toBinaryString(j&(1<<2)));
		System.out.println("j&(1<<1) : "+Integer.toBinaryString(j&(1<<1)));
		System.out.println("j&(1<<0) : "+Integer.toBinaryString(j&(1<<0)));
		System.out.println("j|(1<<2) : "+Integer.toBinaryString(j|(1<<2)));
		System.out.println("j|(1<<1) : "+Integer.toBinaryString(j|(1<<1)));
		System.out.println("j|(1<<0) : "+Integer.toBinaryString(j|(1<<0)));
	}
}
