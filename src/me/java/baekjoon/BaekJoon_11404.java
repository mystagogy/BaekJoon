package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class BaekJoon_11404 {
    static int N,M;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M =  Integer.parseInt(br.readLine());
        map = new int[N+1][N+1];

        IntStream.rangeClosed(1, N).forEach(i -> {
            Arrays.fill(map[i], Integer.MAX_VALUE);
            map[i][i] = 0;
        });



        StringTokenizer st;
        while (M --> 0){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(map[a][b] > c) map[a][b] = c;

        }

        for(int i = 1 ; i <= N ; i ++) {
            for(int j = 1 ; j <= N ; j ++) {
                if(map[j][i] == Integer.MAX_VALUE) continue;
                for(int k = 1 ; k <= N ; k ++) {
                    if(map[i][k] == Integer.MAX_VALUE) continue;

                    if(map[j][k] > map[j][i] + map[i][k]) {
                        map[j][k] = map[j][i] + map[i][k];
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i <= N ; i ++) {
            for(int j = 1 ; j <= N ; j ++) {
                if(map[i][j] == Integer.MAX_VALUE) {
                    sb.append(0).append(" ");

                } else {
                    sb.append(map[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);

    }
}
