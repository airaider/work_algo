package workshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ver2 {
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
			go(0,wx,wy,0,0);
			System.out.println("#"+t+" "+min);
		}
		
	}
	private static void go(int count, int bx, int by, int visited, int result) {
		if(result>=min)return;
		if(count==N) {
			result+=Math.abs(hx-bx)+Math.abs(hy-by);
			if(result<min) min=result;
			return;
		}
		for (int i = 0; i < N; i++) {
			if((visited & (1<<i))==0) {
				go(count+1, arr[i][0], arr[i][1],
						visited|(1<<i), result+Math.abs(arr[i][0]-bx)+Math.abs(arr[i][1]-by));
			}
		}
	}
}
