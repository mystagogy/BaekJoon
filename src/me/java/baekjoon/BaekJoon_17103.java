package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        boolean[] prime = new boolean[1000001];
        for (int i = 2; i <= 1000000; i++) {
            if(!prime[i]){
                for(int j=i+i; j<1000000; j+=i){
                    prime[j] = true;
                }}}

        StringBuilder sb= new StringBuilder();
        while (T --> 0){
            int n = Integer.parseInt(br.readLine());
            int count= 0;
            for (int i = 2; i <= n / 2; i++) {
                if(!prime[i] && !prime[n-i]) count++;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
