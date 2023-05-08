package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BaekJoon_26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        set.add("ChongChong");

        while (N --> 0){
            String[] names = br.readLine().split(" ");
            if(set.contains(names[0]) || set.contains(names[1])){
                for(String name : names) {
                    set.add(name);
                }
            }
        }
        System.out.println(set.size());
    }
}
