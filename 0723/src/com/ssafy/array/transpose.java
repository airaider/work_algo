package com.ssafy.array;

public class transpose {
	public static int[][] arr = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	public static void main(String[] args) {
		show();
		transpose();
		System.out.println();
		show();
	}
	private static void transpose() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr[i].length; j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
		}
		
	}
		/*
		 * for(int[] sub : arr){
		 * 	sysout(Arrays.toString(sub));
		 * }
		 */
	}
	private static void show() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
