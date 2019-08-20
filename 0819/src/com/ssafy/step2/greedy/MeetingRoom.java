package com.ssafy.step2.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class MeetingRoom {
	static boolean vis[];
	static boolean ans[];
	static int N;
	static int max = 0;
	static room arr[];
	static int maxtime = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new room[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			int n = i;
			int s = Integer.parseInt(st.nextToken());
			int f = Integer.parseInt(st.nextToken());
			if(f>maxtime) maxtime=f;
			arr[i] = new room(n,s,f);
		}
		
		List<room> result = makeSchedule(arr);
		System.out.println(result.size());
		for (room room : result) {
			System.out.println(room.start+1);
		}
		
	}
	private static List<room> makeSchedule(room[] list) {
		List<room> result = new ArrayList<room>();
		Arrays.sort(list);
		result.add(list[0]);
		for (int i = 0; i < list.length; i++) {
			if(result.get(result.size()-1).fin <= list[i].start) {
				result.add(list[i]);
			}
		}
		return result;
		
	}

}
class room implements Comparable<room>{
	int num;
	int start;
	int fin;
	public room(int num, int start, int fin){
		this.num = num;
		this.start = start;
		this.fin = fin;
	}
	@Override
	public int compareTo(room o) {
		int a = this.fin - o.fin;
		return a==0?this.start-o.start:a;
	}
}

/* 

Arrays.sort(list, new Comparator<int[]>(){
	public int compare(int[] o1, int[] o2){
		int value = o1[2]-o2[2];
		return value==0?o1[1]-o2[1]:value;
		}
}

 */


/*

10
1 4 1 6 6 10 5 7 3 8 5 9 3 5 8 11 2 13 12 14


*/
