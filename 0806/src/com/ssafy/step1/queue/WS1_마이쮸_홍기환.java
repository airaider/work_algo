package com.ssafy.step1.queue;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

public class WS1_마이쮸_홍기환 {
	
	public static void main(String[] args) {
		bfs();
	}

	private static void bfs() {
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(1,1));
		int sum=0;
		int line=1;
		while(!q.isEmpty()) {
			Point p = q.remove();
			int name = p.x;
			int my = p.y;
			sum+=my;
			if(sum>=20) {
				System.out.println(name);
				return;
			}
			q.add(new Point(name,my+1));
			q.add(new Point(++line,1));
			
		}
	}

}

