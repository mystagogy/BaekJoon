package me.java.baekjoon.java;
import java.util.Scanner;
public class BaekJoon_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alpha = new int[26];
        String str = sc.next().toUpperCase();
        int max = -1;
        char result = 'a';
        for (int i = 0; i < str.length(); i++) {
            alpha[str.charAt(i) - 65]++;
            if (max < alpha[str.charAt(i) - 65]) {
                max = alpha[str.charAt(i) - 65];
                result = str.charAt(i);
            } else if (max == alpha[str.charAt(i) - 65]) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
