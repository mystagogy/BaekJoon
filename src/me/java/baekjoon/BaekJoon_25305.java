package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_25305 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int num = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());
            int[] score = new int[num];
            str = br.readLine();
            st = new StringTokenizer(str);
            for(int i = 0; i < num; i++){
                score[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(score);
            StringBuilder sb = new StringBuilder();
            System.out.println(sb.append(score[score.length-count]));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
