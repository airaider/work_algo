package ws_hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_3124_최소스패닝트리 {
	static int V,E;
	static int[] parents;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			V = Integer.parseInt(st.nextToken());
			E = Integer.parseInt(st.nextToken());
			parents = new int[V+1];
			Arrays.fill(parents, -1);
			child[] edge = new child[E];
			for (int i = 0; i < E; i++) {
				st = new StringTokenizer(br.readLine());
				int v = Integer.parseInt(st.nextToken());
				int e = Integer.parseInt(st.nextToken());
				int w = Integer.parseInt(st.nextToken());
				
				edge[i] = new child(v,e,w);
			}
			Arrays.sort(edge);
			int cnt=0;
			long ans=0;
			for (child info : edge) {
				if(union(info.v, info.e)) {
					cnt++;
					ans+=info.w;
				}
				if(cnt==V-1) break;
			}
			System.out.println("#"+t+" "+ans);
			
			
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

class child implements Comparable<child>{
	int v;
	int e;
	int w;
	
	child(int v, int e, int w){
		this.e=e;
		this.v=v;
		this.w=w;
	}

	@Override
	public int compareTo(child o) {
		return Integer.compare(this.w, o.w);
	}
	
	
}
