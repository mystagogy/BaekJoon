package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1010 {
    public static  int combination(int[][] arr, int n, int r){
        if(arr[n][r] > 0){
            return arr[n][r];
        }
        else if(n==r || r ==0){
            return 1;
        }
        else{
            arr[n][r] = combination(arr, n-1, r-1) + combination(arr, n-1, r);
            return arr[n][r];
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[30][30];

        int num = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int west = Integer.parseInt(st.nextToken());
            int east = Integer.parseInt(st.nextToken());

            sb.append(combination(arr,east, west)).append("\n");

        }
        System.out.println(sb);
    }
}
