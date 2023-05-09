package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 1; i < N; i++) {
            int sum = i;
            int k = i;
            while(k > 0) {
                sum += k % 10;
                k /= 10;
            }
            if(sum == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
