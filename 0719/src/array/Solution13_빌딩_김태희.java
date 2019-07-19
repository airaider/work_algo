package array;

import java.io.FileInputStream;
import java.util.Scanner;

// B구획의 빌딩 최고 높이 구하기
public class Solution13_빌딩_김태희 {
	static int T, N;
	static int Answer;
	static int[][] area;
	static int[][] direction = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("Solution13.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();
			area=new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					area[i][j] = (sc.next().charAt(0) == 'B')?1:0; // 빌딩이면 1, 공원이면 0
				}
			}
			//////////////////////////////
			// 알고리즘 구현
			//////////////////////////////
			Answer=0;
			int bCount=0;
			for(int i=0; i<N; i++) {     //모든 구획을 검색
				for(int j=0; j<N; j++) {
					if(area[i][j]==0)continue;//B구획이 아니면 다음 구획으로	
					
					if(!existsPark(i, j)){
						//인접한 구획에 G가 없을 경우 가로행, 세로열에 있는 B구획을 count
						bCount=0;  // clear
						for(int k=0; k<N; k++){//세로열 B구획 세기
							bCount += (area[k][j]+area[i][k]);
						}
						bCount--;// 자신 중복제거
					}else {
						bCount = 2;
					}
					if(bCount>Answer) Answer=bCount;
				}//end for j
			}//end for i

			System.out.println("#"+test_case+" "+Answer);
		}//end testcase
	}
	
	//팔방이 경계내에 있고 G가 있는 지 확인.
	public static boolean existsPark(int i,int j) {

		int newI=0,newJ=0;
		for(int d=0 ;d<direction.length; ++d) {
			newI = i + direction[d][0];
			newJ = j + direction[d][1];
			if(newI<0 || newI>=N || newJ<0 || newJ>=N // 경계를 벗어나거나
					|| area[newI][newJ]==1) { // 빌딩이면 다음 구획 검사
				continue;
			}else { // 공원이면 탐색 끝
				return true;
			}
		}
		return false;
	}
}
