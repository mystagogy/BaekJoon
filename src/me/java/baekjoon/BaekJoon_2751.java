package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaekJoon_2751 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer>list = new ArrayList<>();
        try{
            int num = Integer.parseInt(br.readLine());
            for(int i = 0; i < num; i++){
                list.add(Integer.parseInt(br.readLine()));
            }
            Collections.sort(list);
            for(int x : list){
                sb.append(x).append("\n");
            }
            System.out.println(sb);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
