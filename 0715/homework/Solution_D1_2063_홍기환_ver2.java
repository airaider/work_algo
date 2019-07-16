import java.util.Arrays;
import java.util.Scanner;

public class Solution1 {
	private static Scanner scan;
	private static int[] arr;
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);  
        int input = scan.nextInt();
        arr = new int [input];
        for(int i=0;i<arr.length;i++) {
        	arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int mid_val=arr.length/2;    	
		
            
        System.out.println(arr[mid_val]);
    	}
        
        
        
    }

