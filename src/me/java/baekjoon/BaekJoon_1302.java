package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon_1302 {
    static int N;
    static HashMap<String, Integer> map = new HashMap<>();
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        while (N --> 0){
            String title = br.readLine();
            map.put(title, map.getOrDefault(title,0)+1);
            max = max >= map.get(title) ? max : map.get(title);
        }
        List<String> list = new ArrayList<>();
        for(String str : map.keySet()){
            if(max == map.get(str)) list.add(str);
        }

        Collections.sort(list);

        System.out.println(list.get(0));
    }
}
