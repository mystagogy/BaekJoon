package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean status = true;
        while (status){
            String str = br.readLine();
            StringBuffer tmp = new StringBuffer(str);
            if(str.equals("0")) break;
            if(str.equals(tmp.reverse().toString())) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        System.out.print(sb);
    }
}
