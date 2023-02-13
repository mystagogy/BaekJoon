package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            long[] dp = new long[101];
            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;
            dp[4] = 2;
            for(int j =4; j <=n; j++){
                dp[j] = dp[j-2] + dp[j-3];
            }
            sb.append(dp[n]).append("\n");
        }
        System.out.println(sb);
    }
}
