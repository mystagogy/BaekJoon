package me.java.baekjoon;

import java.util.Scanner;

public class BaekJoon_2675 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int test_num = sc.nextInt();
            for(int i = 0; i<test_num; i++){
                int num = sc.nextInt();
                String str = sc.next();
                String result = "";
                for(int j=0; j<str.length(); j++){
                    for(int k = 0; k < num; k++)
                        result += str.charAt(j);
                }
                System.out.println(result);
            }
        }
}

