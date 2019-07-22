package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bubble {
	static int stoi(String s) {
		return Integer.parseInt(s);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[st.countTokens()];
		int i=0;
		while(st.hasMoreTokens()) {
			arr[i]=stoi(st.nextToken());
			i++;
		}
		System.out.println(Arrays.toString(arr));
		bubble(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	private static void bubble(int[] arr) {
		for (int i = arr.length-1; i >= 0 ; i--) {
			boolean isSwap = false;
			for (int j = 0; j < i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSwap = true;
				}
			}
			if(!isSwap) break;
		}
		
	}

}
