package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BaekJoon_11725 {
    static int N;
    static int[] arr;
    static boolean[] visit;
    static ArrayList<Integer> list[];
    static void dfs(int idx){
        visit[idx] = true;
        for(int x : list[idx]){
            if(!visit[x]){
                arr[x] = idx;
                dfs(x);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visit = new boolean[N+1];
        list = new ArrayList[N+1];
        arr = new int[N+1];


        for(int i = 0; i <= N; i++){
            list[i] = new ArrayList<>();
        }

        StringTokenizer st;
        for(int i = 0; i < N-1; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list[x].add(y);
            list[y].add(x);
        }

        dfs(1);
        StringBuilder sb = new StringBuilder();
        for(int i = 2; i <= N; i++){
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);

    }
}
