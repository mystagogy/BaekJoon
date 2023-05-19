package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_11054 {
    static int[] arr;
    static int[] left;
    static int[] right;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new int[N+1];
        left = new int[N+1];
        right = new int[N+1];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            left[i] = 1;
            right[i] = 1;
        }


        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                if (arr[i] > arr[j]) {
                    left[i] = Math.max(left[j] + 1, left[i]);
                }
            }
        }


        for (int i = N; i > 0; i--) {
            for (int j = N; j > i; j--) {
                if (arr[i] > arr[j]) {
                    right[i] = Math.max(right[j] + 1, right[i]);
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= N; i++) {
            max = Math.max(max, left[i] + right[i]);
        }

        System.out.println(max-1);

    }
}
