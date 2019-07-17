import java.util.Scanner;

public class Solution {
	private static Scanner scan;
	private static int[] arr;
	private static int[] arr2;
	private static int N;
	
    
    public static void main(String[] args) {
    	scan = new Scanner(System.in);  
    	int t;
        int mk=0;
        int max=0;
    	t=scan.nextInt();
    	for(int j=0;j<t;j++) {
            mk=-1;
            max=-1;
    		N=scan.nextInt();
    		arr = new int [1000];
    		arr2 = new int [101];
    		for(int i=0; i<1000; i++) {
				arr[i]=scan.nextInt();
				arr2[arr[i]]+=1;
            }
    		for(int i=0; i<101; i++) {
    			if(arr2[i]>=max) {
    				max=arr2[i];
    				mk=i;
    			}
    			
    		}
    			
    		
    		
            
            System.out.println("#"+(j+1)+" "+mk);
    	}
        
        
        
    }


}
