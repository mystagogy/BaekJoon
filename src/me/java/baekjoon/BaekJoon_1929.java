package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1929 {
    static void primeNumber(int M, int N) {
        int[] arr = new int[N+1];
        StringBuilder sb = new StringBuilder();

        //배열 초기화
        for (int i = 2; i <= N; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = i+i; j <= N; j += i) {
                arr[j] = 0;
            }
        }
        for (int i = M; i <= N; i++) {
            if (arr[i] != 0) sb.append(i + "\n");
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

       primeNumber(M,N);
    }
}
