package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_16139 {
    static int[][] dp;
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        N = Integer.parseInt(br.readLine());

        dp = new int[26][str.length()+1];
        arr = new int[26][str.length()+1];
        for(int i = 0 ; i < str.length(); i++){
            int idx = str.charAt(i)-'a';
            arr[idx][i]++;
        }

        for(int i = 0; i<26; i++){
            dp[i][0] = arr[i][0];
            for(int j = 1; j<=str.length(); j++){
                dp[i][j] = dp[i][j-1] + arr[i][j-1];
            }
        }

        StringTokenizer st;
        while(N-->0){
            st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();

            int idx = temp.charAt(0)-'a';
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            int sum = dp[idx][right+1] - dp[idx][left];
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
