package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon_2644 {
    static int n,m, p1,p2;
    static int[][] map;
    static boolean[] visited;
    static int bfs(int p1, int p2){
        int result = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(p1);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                int cur = q.poll();
                visited[cur] = true;
                if(cur==p2) return result;
                for (int child = 1; child <= n; child++) {
                    if (map[cur][child] == 1) {
                        if (!visited[child])
                            q.add(child);
                    }
                }
            }
            result++;
        }
        return -1;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(bfr.readLine());
        n = Integer.parseInt(stk.nextToken());
        map = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        stk = new StringTokenizer(bfr.readLine());
        p1 = Integer.parseInt(stk.nextToken());
        p2 = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(bfr.readLine());
        m = Integer.parseInt(stk.nextToken());
        for (int i = 0; i < m; i++) {
            stk = new StringTokenizer(bfr.readLine());
            int parent = Integer.parseInt(stk.nextToken());
            int child = Integer.parseInt(stk.nextToken());
            map[parent][child] = 1;
            map[child][parent] = 1;
        }
        System.out.print(bfs(p1, p2));
    }

}
