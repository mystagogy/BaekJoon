package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1309 {
    static int N;
    static long[][] dp;
    static final int X = 9901;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new long[N + 1][3];
        dp[1][0] = dp[1][1] = dp[1][2] = 1;

        for (int i = 2; i <= N; i++) {
            dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % X;
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % X;
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % X;
        }

        System.out.print((dp[N][0] + dp[N][1] + dp[N][2]) % X);
    }
}
