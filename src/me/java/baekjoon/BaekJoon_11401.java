package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_11401 {
    static long N;
    static long K;
    final static long rest = 1000000007;
    static long factorial(long N){
        long x = 1;
        while (N > 1){
            x = (x*N)%rest;
            N--;
        }
        return x;
    }
   static long pow(long x, long y) {
        if(y == 1) {
            return x % rest;
        }

        long temp = pow(x, y / 2);

        if(y % 2 == 1) {
            return (temp * temp % rest) * x % rest;
        }
        return temp * temp % rest;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Long.parseLong(st.nextToken());
        K = Long.parseLong(st.nextToken());

        long x = factorial(N);
        long y = factorial(K) * factorial(N - K) % rest;

        System.out.println(x * pow(y, rest - 2) % rest);

    }

}
