package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BaekJoon_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int num = 0;
            while (st.hasMoreTokens()){
                num = Integer.parseInt(st.nextToken());
            }
            if(command.equals("add")){
                set.add(num);
            } else if (command.equals("remove")) {
                set.remove(num);
            } else if (command.equals("check")){
                if(set.contains(num)) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else if (command.equals("toggle")) {
                if(set.contains(num)) set.remove(num);
                else set.add(num);
            } else if (command.equals("all")) {
                set.clear();
                for(int j = 1; j < 21; j++) set.add(j);
            } else if (command.equals("empty")){
                set.clear();
            }
        }

        System.out.println(sb);
    }
}
