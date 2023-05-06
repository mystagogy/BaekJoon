package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N+1];

        arr[0] = 1;
        for(int i = 1; i < arr.length; i++){
            arr[i] = i*arr[i-1];
        }

        System.out.println(arr[N]);
    }
}
