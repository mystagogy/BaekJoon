package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if('A' <= str.charAt(i) && str.charAt(i) <='Z') sb.append((char) ('a'+str.charAt(i) - 'A'));
            else sb.append((char)('A' + str.charAt(i) - 'a'));
        }

        System.out.println(sb);
    }
}
