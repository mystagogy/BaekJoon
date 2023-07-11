package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_11051 {
    static int[][] dp;
    static final int div = 10007;
    static int calc(int n, int k) {

        if (dp[n][k] > 0) return dp[n][k];

        if (k == 0 || n == k) return dp[n][k] = 1;

        return dp[n][k] = (calc(n - 1, k - 1) + calc(n - 1, k)) % div;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        dp = new int[N + 1][K + 1];

        System.out.println(calc(N, K));
    }
}
