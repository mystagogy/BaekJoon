package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_1026 {
    private static int N;
    private static int[] A;
    private static int[] B;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        A = new int[N];
        B = new int[N];
        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i = 0; i < A.length; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        st= new StringTokenizer(br.readLine());
        for(int i = 0; i < B.length; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for(int i = 0; i < A.length; i++){
            sum += A[i] * B[B.length-1-i];
        }

        System.out.println(sum);

    }
}
