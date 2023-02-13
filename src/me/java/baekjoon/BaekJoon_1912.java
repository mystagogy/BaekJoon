package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon_1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long[] dp = new long[n];
        dp[0] = arr[0];
        long sum = 0;
        for(int i = 1; i < arr.length; i++){
            if(dp[i-1]>0) {
                sum = dp[i-1];
            }
            else {
                sum = 0;
            }
            sum += arr[i];
            dp[i] = sum;
        }
        Arrays.sort(dp);
        System.out.println(dp[n-1]);
    }
}
