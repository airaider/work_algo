package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class counting {
	static int stoi(String s) {
		return Integer.parseInt(s);
	}
	public static void main(String[] args) throws IOException {
		int[] arr = new int[] {0,4,1,3,1,2,4,1}; 
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(counting(arr)));
		
		
	}
	private static int[] counting(int[] arr) {
		int[] counts = new int[5];
		//1. count세기
		for (int i = 0; i < arr.length; i++) {
			counts[arr[i]]++;
		}
		//2. count 누적하기
		for (int i = 1; i < 5; i++) {
			//i-1	i
			counts[i] = counts[i-1]+counts[i];
		}
		//3. 누적 count 이용하여 자기 자리 찾아주기
		int[] newArr = new int[arr.length];
		for (int i = arr.length-1; i >= 0; --i) {
			newArr[--counts[arr[i]]] = arr[i];
		}
		return newArr;
		
	}

}
