import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		String[] arr = in.readLine().split(" ");
		int count;
		int j=0;
		int max=0;
		for(int i=0;i<T-1;++i) {
			count=0;
			int start = Integer.parseInt(arr[i]);
			for(j=i+1;j<T;++j) {
				if(start>Integer.parseInt(arr[j])) {
					++count;
				}
				else if (start<=Integer.parseInt(arr[j])) {
					break;
				}
			}
			for(int k=j;k<T;++k) {
				if(Integer.parseInt(arr[k])==0) {
					++count;
				}
			}
			if(count>max) {
				max=count;
			}
			
		}
		System.out.println(max);
		
		
	}
}
