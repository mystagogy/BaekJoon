package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon_1181 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, Integer> map = new TreeMap<>();
        try{
            int num = Integer.parseInt(br.readLine());
            for(int i = 0; i < num; i++){
                String str = br.readLine();
                if(!map.containsKey(str)){
                    map.put(str, str.length());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> keySet = new ArrayList<>(map.keySet());
        StringBuilder sb =new StringBuilder();
        keySet.sort((o1, o2) -> map.get(o1) - map.get(o2));
        for (String key : keySet) {
            sb.append(key).append("\n");
        }
        System.out.println(sb);
    }
}
