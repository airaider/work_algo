package com.ssafy.step3.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
 
public class Solution_1228{
 
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int t=1;t<=10;t++) {
            int N=Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> amho = new LinkedList<Integer>();
            for(int i=0;i<N;i++) {
                amho.add(Integer.parseInt(st.nextToken()));
            }
            int M=Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<M;i++) {
                st.nextToken();
                int here = Integer.parseInt(st.nextToken());
                int howmuch = Integer.parseInt(st.nextToken());
                for(int m=0;m<howmuch;m++) {
                    amho.add(here+m, Integer.parseInt(st.nextToken()));
                }
            }
            System.out.println("#"+t+" ");
            for(int i=0;i<10;i++) {
                System.out.print(amho.get(i)+" ");
            }
            System.out.println();
             
        }
    }
 
}