package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] count = new int[11];
        count[0] = 0;
        count[1] = 1;
        count[2] = 2;
        count[3] = 4;
        for(int j = 4; j < 11; j++){
            count[j] = count[j-1] + count[j-2] + count[j-3];
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < num; i++){
            sb.append(count[Integer.parseInt(br.readLine())]).append("\n");
        }
        System.out.println(sb);
    }
}
