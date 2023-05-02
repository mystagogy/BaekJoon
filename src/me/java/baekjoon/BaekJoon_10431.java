package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_10431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[21];
            for(int j = 0; j < arr.length; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int result = 0;
            for(int j = 2; j < arr.length; j++){
                for(int k = 1; k < j; k++){
                    if(arr[k] > arr[j]) result++;
                }
            }
            sb.append(arr[0]).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }
}
