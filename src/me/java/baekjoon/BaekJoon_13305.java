package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        long[] distance = new long[num-1];
        long[] prices = new long[num];

        StringTokenizer st= new StringTokenizer(br.readLine());

        for(int i = 0; i < distance.length; i++){
            distance[i] = Long.valueOf(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < prices.length; i++){
            prices[i] = Long.valueOf(st.nextToken());
        }

        long sum = 0;
        long min = prices[0];

        for(int i=0; i<distance.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            }
            sum += (min * distance[i]);
        }

        System.out.println(sum);
    }
}
