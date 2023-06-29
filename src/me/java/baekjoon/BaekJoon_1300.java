package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        long low = 1;
        long high = K;


        while(low < high) {
            long mid = (low + high) / 2;
            long count = 0;


            for(int i = 1; i <= N; i++) {
                count += Math.min(mid/i, N);
            }

            if(K <= count) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }

        System.out.println(low);

    }
}
