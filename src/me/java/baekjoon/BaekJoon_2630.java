package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2630 {
    static int N;
    static int[][] map;
    static StringBuilder sb = new StringBuilder();
    static int white = 0;
    static int blue = 0;
    static void partition(int row, int col, int size){
        if(check(row,col,size)){
            if(map[row][col] == 0) white++;
            else blue++;
            return;
        }

        int newSize = size/2;

        partition(row, col, newSize);
        partition(row+newSize, col, newSize);
        partition(row, col+newSize, newSize);
        partition(row+newSize, col+newSize, newSize);
    }

    static boolean check(int row, int col, int size){
        int color = map[row][col];
        for(int i = row; i < row + size; i++){
            for(int j = col; j < col + size; j++){
                if(color != map[i][j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        StringTokenizer st;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0,0,N);
        sb.append(white).append("\n").append(blue);
        System.out.println(sb);

    }
}
