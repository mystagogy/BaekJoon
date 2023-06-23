package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_5582 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int[][] dp = new int[str2.length() + 1][str1.length() + 1];
        int result = 0;
        for (int i = 0; i < str2.length(); ++i) {
            for (int j = 0; j < str1.length(); ++j) {
                if (str2.charAt(i) == str1.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                    result = (result < dp[i + 1][j + 1]) ? dp[i + 1][j + 1] : result;
                }
            }
        }
        System.out.println(result);
    }
}
