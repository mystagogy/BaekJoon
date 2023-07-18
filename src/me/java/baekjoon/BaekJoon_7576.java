package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon_7576 {
    static int N,M;
    static int[][] box;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static Queue<Tomato> q = new LinkedList<Tomato>();

    static class Tomato{
        int x;
        int y;
        int day;

        public Tomato(int x, int y, int day){
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
    static void bfs(){
        int day = 0;

        while(!q.isEmpty()){
            Tomato t = q.poll();
            day = t.day;

            for(int i = 0; i < 4; i++){
                int nx = t.x + dx[i];
                int ny = t.y + dy[i];

                if( nx >= 0 && nx < N && ny >= 0 && ny < M){
                    if(box[nx][ny] == 0){
                        box[nx][ny] = 1;
                        q.offer(new Tomato(nx, ny, day+1));
                    }
                }
            }
        }
        if(check()) System.out.println(day);
        else System.out.println(-1);

    }
    static boolean check() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        box = new int[N][M];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                box[i][j] = Integer.parseInt(st.nextToken());
                if(box[i][j] == 1) q.offer(new Tomato(i,j,0));
            }
        }
        bfs();
    }
}
