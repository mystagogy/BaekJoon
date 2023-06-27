package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2740 {
    static int[][] A;
    static int[][] B;
    static int N;
    static int M;
    static int K;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        N = Integer.parseInt(temp[0]);
        M = Integer.parseInt(temp[1]);
        A = new int[N][M];
        StringTokenizer st;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        temp = br.readLine().split(" ");
        M = Integer.parseInt(temp[0]);
        K = Integer.parseInt(temp[1]);
        B = new int[M][K];
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < K; j++){
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < K; j++) {
                int sum = 0;
                for(int k = 0; k < M; k++) {
                    sum += A[i][k] * B[k][j];
                }
                sb.append(sum).append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
