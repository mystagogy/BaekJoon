package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();
        String[] expressions = expression.split("-");

        int sum = 0;
        for(int i = 0; i < expressions.length; i++){
            int temp = 0;
            String[] add = expressions[i].split("[+]");
            for(String num : add){
                temp += Integer.parseInt(num);
            }

            if(i == 0) sum += temp;
            else sum -= temp;

        }
        System.out.println(sum);
    }
}
