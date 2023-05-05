package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BaekJoon_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int len = 1;
        HashSet<String> set = new HashSet<>();
        while (len < str.length()){
            for(int i = 0; i+len <= str.length(); i++){
                set.add(str.substring(i,i+len));
            }
            len++;
        }
        System.out.println(set.size()+1);
    }
}
