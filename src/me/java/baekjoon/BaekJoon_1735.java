package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1735 {
    static int GCD(int x, int y){
        if(x<=y){
            int tmp = x;
            x = y;
            y = tmp;
        }
        if (y == 0) {
            return x;
        }
        return GCD(y , x % y);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int numerator = A * D + B * C;
        int denominator = B * D;

        int mod = GCD(numerator, denominator);
        numerator /= mod;
        denominator /= mod;


        StringBuilder sb = new StringBuilder();

        sb.append(numerator).append(" ").append(denominator);
        System.out.println(sb);

    }
}
