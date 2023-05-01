package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] result = new int[26];

        char[] first = br.readLine().toCharArray();
        char[] second = br.readLine().toCharArray();

        for(char ch : first) result[ch-97]++;
        for(char ch : second) result[ch-97]--;

        int sum = 0;
        for(int count : result) sum += Math.abs(count);

        System.out.println(sum);
    }
}
