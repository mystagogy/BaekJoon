package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_25682 {
    static int N;
    static int M;
    static int K;
    static int[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[N+1][M+1];
        boolean color = false;
        for(int i=1;i<=N;i++){
            String str = br.readLine();
            for(int j=1;j<=M;j++){
                char c = str.charAt(j-1);
                if(!color && c == 'W') map[i][j] = 1;
                else if(color && c == 'B') map[i][j] = 1;
                color = !color;
            }
            if(M % 2 == 0) color = !color;
        }

        for(int i=1;i<=N;i++){
            int temp = map[i][1];
            for(int j=2;j<=M;j++){
                temp += map[i][j];
                map[i][j] = temp;
            }
        }
        for(int i=1;i<=M;i++){
            int temp = map[1][i];
            for(int j=2;j<=N;j++){
                temp += map[j][i];
                map[j][i] = temp;
            }
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=K;i<=N;i++){
            for(int j=K;j<=M;j++){
                int temp = map[i][j] - (map[i-K][j] + map[i][j-K] - map[i-K][j-K]);
                min = Math.min(min, temp);
                max = Math.max(max, temp);
            }
        }
        System.out.println(Math.min(min, K*K - max));
    }
}
