package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class BaekJoon_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        while (st.hasMoreTokens()){
            set.add(Integer.parseInt(st.nextToken()));
        }

        br.readLine();

        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();

        while (st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }

        StringBuilder sb = new StringBuilder();

        for(int x : list){
            if(set.contains(x)){
                sb.append("1").append("\n");
            }
            else{
                sb.append("0").append("\n");
            }
        }

        System.out.println(sb);
    }
}
