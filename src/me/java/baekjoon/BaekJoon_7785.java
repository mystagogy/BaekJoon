package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class BaekJoon_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        while (n --> 0){
            String[] info = br.readLine().split(" ");
            if(info[1].equals("enter")) set.add(info[0]);
            else set.remove(info[0]);
        }

        List<String> list = new ArrayList<>(set);
        list.sort(Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(String name : list){
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
}
