package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_9094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int result = 0;
            for (int x = 1; x < N; x++) {
                for (int y = x + 1; y < N; y++) {
                    if (((x * x) + (y * y) + M) % (x * y) == 0) {
                        result++;
                    }
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
