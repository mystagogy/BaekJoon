package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


class Grade implements Comparable<Grade>{
    int first;
    int second;

    public Grade(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(Grade o) {
        if(this.first > o.first) { return 1; }
        else { return -1; }
    }
}

public class BaekJoon_1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num; i++) {
            int count = Integer.parseInt(br.readLine());
            ArrayList<Grade> list = new ArrayList<>();
            for (int j = 0; j < count; j++) {
                String[] str = br.readLine().split(" ");
                int first = Integer.parseInt(str[0]);
                int second = Integer.parseInt(str[1]);
                list.add(new Grade(first, second));
            }
            Collections.sort(list);
            int result = 1;
            int min = list.get(0).second;
            for (int j = 1; j < count; j++) {
                if (list.get(j).second < min) {
                    result++;
                    min = list.get(j).second;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
