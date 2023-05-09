package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for(int i = 666; ; i++){
            String str = String.valueOf(i);
            if(str.contains("666")) count++;
            if(count == N) {
                System.out.println(i);
                return;
            }
        }
    }
}
