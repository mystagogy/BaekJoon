package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2096 {
    static int N;
    static int[][] arr, maxDP, minDP;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N+1][3];
        maxDP = new int[N+1][3];
        minDP = new int[N+1][3];

        StringTokenizer st;
        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i <= N; i++){
            for(int j = 0; j < 3; j++){
                if(j == 0) {
                    minDP[i][j] = arr[i][j] + Math.min(minDP[i-1][0], minDP[i-1][1]);
                    maxDP[i][j] = arr[i][j] + Math.max(maxDP[i-1][0], maxDP[i-1][1]);
                }
                else if(j == 1){
                    minDP[i][j] = arr[i][j] + Math.min(Math.min(minDP[i-1][0], minDP[i-1][1]), minDP[i-1][2]);
                    maxDP[i][j] = arr[i][j] + Math.max(Math.max(maxDP[i-1][0], maxDP[i-1][1]), maxDP[i-1][2]);
                }
                else if(j == 2){
                    minDP[i][j] = arr[i][j] + Math.min(minDP[i-1][2], minDP[i-1][1]);
                    maxDP[i][j] = arr[i][j] + Math.max(maxDP[i-1][2], maxDP[i-1][1]);
                }

            }
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 3; i++){
            min = Math.min(min, minDP[N][i]);
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 3; i++){
            max = Math.max(max, maxDP[N][i]);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(max).append(" ").append(min);

        System.out.println(sb);
    }
}
