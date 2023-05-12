package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_15652 {
    static int N,M;
    static boolean[] visited;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int depth, int start){
        if(M == depth){
            for(int x : arr){
                sb.append(x).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start; i < N; i++){
            visited[i] = true;
            arr[depth] = i+1;
            dfs(depth+1, i);
            visited[i] = false;

        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N];
        arr = new int[M];
        dfs(0,0);
        System.out.println(sb);
    }
}
