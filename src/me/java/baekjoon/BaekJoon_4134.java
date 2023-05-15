package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T --> 0){
            long n = Long.parseLong(br.readLine());
            long i = 0;
            if(n == 0 || n == 1)
                sb.append(2).append("\n");
            else {
                while(i*i <= n) {
                    for(i = 2; i*i<=n; i++) {
                        if(n%i == 0) {
                            i = 0;
                            n += 1;
                            break;
                        }
                    }
                }
                sb.append(n).append("\n");
            }
        }
        System.out.println(sb);
    }
}
