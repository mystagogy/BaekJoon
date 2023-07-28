package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class tomato{
    int x;
    int y;
    int z;
    public tomato(int z, int x, int y){
        this.z = z;
        this.x = x;
        this.y = y;

    }
}
public class BaekJoon_7569 {
    static int H,N,M;
    static int[][][] box;
    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};
    static Queue<tomato> q = new LinkedList<>();

    public static int bfs() {
        while (!q.isEmpty()) {
            tomato t = q.remove();
            int x = t.x;
            int y = t.y;
            int z = t.z;
            for (int i = 0; i < 6; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nz = z + dz[i];
                if (nx >= 0 && ny >= 0 && nz >= 0 && nx < N && ny < M && nz < H) {
                    if (box[nz][nx][ny] == 0) {
                        q.add(new tomato(nz, nx, ny));
                        box[nz][nx][ny] = box[z][x][y] + 1;
                    }
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (box[i][j][k] == 0) return -1;
                    max = Math.max(max, box[i][j][k]);
                }
            }
        }

        if (max == 1) return 0;
        return (max - 1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        box = new int[H][N][M];

        for(int i = 0; i < H; i++){
            for(int j = 0; j < N; j++){
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < M; k++){
                    int x = Integer.parseInt(st.nextToken());
                    box[i][j][k] = x;
                    if(x == 1) q.add(new tomato(i,j,k));
                }
            }
        }
        System.out.print(bfs());
    }
}
