package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_10844 {
    static long[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new long[N + 1][10];

        long mod = 1_000_000_000;

        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) dp[i][j] = (dp[i - 1][j + 1]) % mod;
                else if (j == 9) dp[i][j] = (dp[i - 1][j - 1]) % mod;
                else dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;
            }
        }
        long sum = 0;
        for(long x : dp[N]){
            sum += x;
        }
        System.out.println(sum);
    }
}
