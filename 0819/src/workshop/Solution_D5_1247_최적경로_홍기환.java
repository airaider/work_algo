package workshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D5_1247_최적경로_홍기환 {
	static int min;
	static int N;
	static int[][] arr;
	static int wx,wy;
	static int hx,hy;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			min=Integer.MAX_VALUE;
			N = Integer.parseInt(br.readLine());
			arr = new int[N][2];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			wx=Integer.parseInt(st.nextToken());
			wy=Integer.parseInt(st.nextToken());
			hx=Integer.parseInt(st.nextToken());
			hy=Integer.parseInt(st.nextToken());
			for (int i = 0; i < N; i++) {
				arr[i][0]=Integer.parseInt(st.nextToken());
				arr[i][1]=Integer.parseInt(st.nextToken());
			}
			permutation(0);
			System.out.println("#"+t+" "+min);
		}
		
	}
	private static void permutation(int index) {
		if(index == N) {
			calculate();
			return;
		}
		
		
		for(int i=index; i<N; ++i) {
			swap(index, i);
			permutation(index+1);
			swap(index, i);
		}
	}
	
	private static void calculate() {
		int dis=Math.abs(wx-arr[0][0])+Math.abs(wy-arr[0][1]);
		for (int i = 1; i < N; i++) {
			if(dis>=min) return;
			dis+=Math.abs(arr[i][0]-arr[i-1][0])+Math.abs(arr[i][1]-arr[i-1][1]);
		}
		dis+=Math.abs(arr[N-1][0]-hx)+Math.abs(arr[N-1][1]-hy);
		if(dis<min) {
			min=dis;
		}
	}
	private static void swap(int i, int j) {
		int[] temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
