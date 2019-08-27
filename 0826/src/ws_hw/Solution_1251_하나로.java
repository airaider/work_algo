package ws_hw;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class Solution_1251_하나로{
	static int N;
	static double E;
	static int[] parents;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			Point[] p = new Point[N];
			StringTokenizer sx = new StringTokenizer(br.readLine());
			StringTokenizer sy = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				p[i] = new Point(Integer.parseInt(sx.nextToken()),Integer.parseInt(sy.nextToken()));
			}
			E = Double.parseDouble(br.readLine());
			parents = new int[N];
			Arrays.fill(parents, -1);
			ArrayList<info> arr = new ArrayList<info>();
			for (int i = 0; i < N-1; i++) {
				for (int j = i+1; j < N; j++) {
					double dis = (Math.pow(p[i].x-p[j].x, 2)+Math.pow(p[i].y-p[j].y, 2))*E;
					arr.add(new info(i,j,dis));
				}
			}
			Collections.sort(arr);
			double ans=0;
			int cnt=0;
			for (info info : arr) {
				if(union(info.e, info.v)) {
					ans+=info.w;
					cnt++;
				}
				if(cnt==N-1) break;
			}
			System.out.println("#"+t+" " +Math.round(ans));
		}
		
		
	}
	
	private static boolean union(int a, int b) {
		int aRoot = find(a);
		int bRoot = find(b);
		if(aRoot != bRoot) { 
			parents[bRoot] = aRoot;
			return true;
		}
		return false;
	}

	private static int find(int a) {
		if(parents[a]<0) return a;	
		return parents[a] = find(parents[a]);	
	}

}

class info implements Comparable<info>{
	int v;
	int e;
	double w;
	
	info(int v, int e, double dis){
		this.e=e;
		this.v=v;
		this.w=dis;
	}

	@Override
	public int compareTo(info o) {
		if(this.w>o.w) return 1;
		if(this.w<o.w) return -1;
		return 0;
	}

	

	
}