package workshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ver3 {
	static int min;
	static int N;
	static int[][] arr;
	static int[][] distance;
	static int wx,wy;
	static int hx,hy;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) { 
			min=Integer.MAX_VALUE;
			N = Integer.parseInt(br.readLine());
			arr = new int[N][2];
			distance = new int[N+2][2];
			StringTokenizer st = new StringTokenizer(br.readLine());
			distance[0][0]=Integer.parseInt(st.nextToken());
			distance[0][1]=Integer.parseInt(st.nextToken());
			distance[N-1][0]=Integer.parseInt(st.nextToken());
			distance[N-1][1]=Integer.parseInt(st.nextToken());
			hx=Integer.parseInt(st.nextToken());
			hy=Integer.parseInt(st.nextToken());
			for (int i = 0; i < N; i++) {
				arr[i][0]=Integer.parseInt(st.nextToken());
				arr[i][1]=Integer.parseInt(st.nextToken());
			}
			
			System.out.println("#"+t+" "+go());
		}
		
	}
	private static int go() {
		int min = Integer.MAX_VALUE;
		int[] np = new int[N];
		for (int i = 0; i < N; ++i) np[i] = i+1;
		
		do {
			for (int i = 0; i < N; i++) {
				distance[np[i]][0] = arr[i][0];
				distance[np[i]][0] = arr[i][0];
			}
			int result = 0;
			for (int i = 0; i <=N ; i++) {
				result+=Math.abs(distance[i][0]-distance[i+1][0]);
				result+=Math.abs(distance[i][1]-distance[i+1][1]);
			}
			if(result<min) min = result;
		}while(nextPermutation(np));
		return min;
	}
	
	private static boolean nextPermutation(int[] numbers) {
		int i=N-1;
		while(i>0 && numbers[i-1]>=numbers[i]) --i;
		
		if(i==0) return false;
		
		int j=N-1;
		while(numbers[i-1]>numbers[j]) --j;
		
		swap(numbers, i-1,j);
		
		j=N-1;
		while(i<j) {
			swap(numbers, i++, j--);
		}
		return true;
	}
	
	private static void swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}
