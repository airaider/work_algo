package array;

import java.util.Arrays;

public class gravity {
	public static void main(String[] args) {
		int [][]map = new int [9][9];
		int [][]drop = new int [9][9];
		int [][]grav = new int [9][9];
		int[] a = {7,4,2,0,0,6,0,7,0};
		int[] cnt = new int[9];
		
		for (int i = 0; i < 9; i++) {
			if(a[i]!=0) {
				for (int j = 8; j >=9-a[i] ; j--) {
					map[j][i]=a[i];
				}
			}
		}
		show(map);
		System.out.println();
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if(map[i][j]!=0) {
					int base=9-j;
					for(int k=j;k<9;k++) {
						if(map[i][k]!=0) {
							base--;
						}
					}
					map[i][j]=base;
				}
			}
		}
		show(map);
		System.out.println();
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if(map[i][j]!=0) {
					cnt[8-i]+=1;
				}
			}
		}
		System.out.println(Arrays.toString(cnt));
		
		for (int i = 0; i < 9; i++) {
			if(cnt[i]!=0) {
				for (int j = 8; j >=9-cnt[i] ; j--) {
					grav[j][i]=cnt[i];
				}
			}
		}
		
		show(grav);
		System.out.println();
		
	}
	
	private static void show(int[][] mp) {
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.printf("%2d",mp[i][j]);
			}
			System.out.println();
		}
		
	}
	
}
