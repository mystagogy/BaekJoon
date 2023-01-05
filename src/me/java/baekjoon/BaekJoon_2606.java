package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2606 {
    static int[][] graph;
    static int N;
    static int M;
    static boolean[] defected;

    public static void dfs(int start){
        defected[start] = true;
        for(int i =1; i<N+1; i++){
            if(graph[start][i] == 1 && defected[i]==false){
                dfs(i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        graph = new int[N+1][N+1];
        defected = new boolean[N+1];

        for(int i = 0; i < M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        dfs(1);

        int answer = -1;
        for(boolean status : defected){
            if(status){
                answer++;
            }
        }

        System.out.println(answer);
    }
}
