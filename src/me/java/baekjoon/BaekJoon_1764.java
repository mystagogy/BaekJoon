package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        StringTokenizer st = new StringTokenizer(number);
        int hear = Integer.parseInt(st.nextToken());
        int announce = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < hear; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> result = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < announce; i++) {
            String tmp = br.readLine();
            if(set.contains(tmp)){
                count++;
                result.add(tmp);
            }
        }

        Collections.sort(result);

        StringBuilder sb = new StringBuilder();
        sb.append(count);
        for(String name : result){
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
}
