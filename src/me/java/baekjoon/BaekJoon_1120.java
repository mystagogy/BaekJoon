package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String str1 = str[0];
        String str2 = str[1];

        int count = str1.length();
        for(int i=0;i<str2.length()-str1.length()+1;i++){
            int temp=0;
            for(int j=0;j<str1.length();j++){
                if(str1.charAt(j)!=str2.charAt(j+i)) temp++;
            }
            if(count > temp) count = temp;
        }
        System.out.println(count);
    }
}
