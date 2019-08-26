package dd;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1251_하나로 {
	static int N;
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
	int w;
	
	info(int v, int e, int w){
		this.e=e;
		this.v=v;
		this.w=w;
	}

	@Override
	public int compareTo(info o) {
		int a = this.w-o.w;
		return a;
	}
	
	
}
