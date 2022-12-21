package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_11047 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());

        int[] coins = new int[num];

        for(int i = coins.length-1; i > -1; i--){
            coins[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        while (sum != 0){
            for(int coin : coins )
                if(sum/coin > 0){
                    count += sum/coin;
                    sum %= coin;
                }
        }
        System.out.println(count);
    }
}
