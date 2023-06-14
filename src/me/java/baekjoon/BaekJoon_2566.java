package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2566 {
    static int[][] arr = new int[9][9];
    static int row;
    static int column;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i = 0; i < 9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] >= max){
                    max = arr[i][j];
                    row = i+1;
                    column = j+1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n").append(row).append(" ").append(column);
        System.out.println(sb);
    }
}
