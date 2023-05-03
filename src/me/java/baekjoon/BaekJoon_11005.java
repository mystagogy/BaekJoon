package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long num = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());

        StringBuffer sb = new StringBuffer();
        while (num > 0){
            long D = num%B;
            if(D < 10) sb.append(D);
            else sb.append((char)(D-10+'A'));
            num /= B;
        }

        System.out.println(sb.reverse());

    }
}
