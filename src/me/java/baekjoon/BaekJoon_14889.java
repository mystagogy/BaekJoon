package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_14889 {
    static int N;
    static int[][] buff;
    static boolean[] visit;
    static int min = Integer.MAX_VALUE;

    static void dfs(int idx, int count) {

        if(count == N / 2) {
            abs();
            return;
        }

        for(int i = idx; i < N; i++) {
            if(!visit[i]) {
                visit[i] = true;
                dfs(i + 1, count + 1);
                visit[i] = false;
            }
        }
    }

    static void abs() {
        int start = 0;
        int link = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visit[i] == true && visit[j] == true) {
                    start += buff[i][j];
                    start += buff[j][i];
                }
                else if (visit[i] == false && visit[j] == false) {
                    link += buff[i][j];
                    link += buff[j][i];
                }
            }
        }

        int result = Math.abs(start - link);
        if (result == 0) {
            System.out.println(result);
            System.exit(0);
        }

        min = Math.min(result, min);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        buff = new int[N][N];
        visit = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                buff[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0, 0);
        System.out.println(min);

    }
}
