package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BaekJoon_25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        int result = 0;
        while (N --> 0){
            String name = br.readLine();
            if(name.equals("ENTER")) {
                result += set.size();
                set.clear();
            }
           else set.add(name);
        }

        System.out.println(result + set.size());
    }
}
