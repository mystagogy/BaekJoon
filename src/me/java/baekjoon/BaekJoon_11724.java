package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_11724 {
    static int arr[][];
    static boolean visited[];
    static int N,M, count;

    static void dfs(int index) {

        if(visited[index] == true) {
            return;
        }

        visited[index] = true;
        for(int i=1; i<=N; i++) {
            if(arr[index][i] == 1) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        count = 0;
        for(int i=1; i<=N; i++) {
            if(visited[i] == false) {
                dfs(i);
                count++;
            }
        }
        System.out.print(count);
    }
}
