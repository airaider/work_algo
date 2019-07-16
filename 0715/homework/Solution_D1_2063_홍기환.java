import java.util.Scanner;

public class Solution {
	private static Scanner scan;
	private static int[] arr;
	private static int N;
	public void sort(int[] data, int l, int r){
        int left = l;
        int right = r;
        int pivot = data[(l+r)/2];
        
        do{
            while(data[left] < pivot) left++;
            while(data[right] > pivot) right--;
            if(left <= right){    
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);
        
        if(l < right) sort(data, l, right);
        if(r > left) sort(data, left, r);
    }
    
    public static void main(String[] args) {
    	scan = new Scanner(System.in);  
        N=scan.nextInt();
        arr = new int [N];
        for(int i=0; i<N; i++) {
        	arr[i]=scan.nextInt();
        }
        Solution quick = new Solution();
        quick.sort(arr, 0, arr.length - 1);
        System.out.println(arr[N/2]);
        
    }


}
