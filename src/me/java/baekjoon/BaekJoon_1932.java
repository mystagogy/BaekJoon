package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1932 {
    static int[][] arr;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr= new int[n+1][n+2];
        for(int i = 1; i <= n ;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= i; j++){
                if(i == 1) arr[i][j] = Integer.parseInt(st.nextToken());
                else if(i==2) arr[i][j] = Integer.parseInt(st.nextToken()) + arr[1][1];
                else {
                    arr[i][j] = Integer.parseInt(st.nextToken()) + Math.max(arr[i-1][j-1], arr[i-1][j]);
                }
            }
        }

        int max = 0;
        for(int x : arr[n]){
            if(max < x) max = x;
        }

        System.out.println(max);

    }
}
