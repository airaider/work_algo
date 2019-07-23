package sort;

import java.util.Arrays;

public class binary {
	static int[] arr = new int[] {4,10,95,46,82,23,0,7,14,62};
	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		binary(0,(arr.length),95);
		System.out.println(Arrays.binarySearch(arr, 4));
	}

	private static void binary(int s, int e, int k) {
		int i = (s+e)/2;
		if(arr[i]>k) {
			binary(s,i-1,k);
			return;
		}
		if(arr[i]<k) {
			binary(i+1,e,k);
			return;
		}
		if(arr[i]==k) {
			System.out.println("!!!!"+i+"!!!!");
			return;
		}
		
	}
}
