package me.java.baekjoon;

import java.io.*;
import java.util.*;

public class BaekJoon_4963 {
    static int arr[][];
    static boolean visit[][];
    static int dx[] = {0, 0, -1 ,1, -1, 1, -1, 1};
    static int dy[] = {-1, 1, 0, 0, 1, 1, -1, -1};

    static int w, h, X, Y;
    static void DFS(int x, int y) {
        visit[x][y] = true;
        for(int i=0; i<8; i++) {
            X = dx[i] + x;
            Y = dy[i] + y;
            if(X >= 0 && Y >= 0 && X < h && Y < w && !visit[X][Y] && arr[X][Y] == 1) {
                DFS(X, Y);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String str = " ";
        while( !(str = br.readLine()).equals("0 0") ) {
            st = new StringTokenizer(str);

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            arr = new int[h][w];
            visit = new boolean[h][w];

            for(int i=0; i<h; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<w; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int count = 0;
            for(int i=0; i<h; i++) {
                for(int j=0; j<w; j++) {

                    if(!visit[i][j] && arr[i][j] == 1) {
                    count++;
                    DFS(i, j);
                }
            }
        }
        sb.append(count).append('\n');
    }
		System.out.print(sb);

    }
}
