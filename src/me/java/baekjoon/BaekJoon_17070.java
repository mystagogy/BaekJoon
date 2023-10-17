package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_17070 {
    static int[][] map;
    static int N;
    static int count = 0;

    static void dfs(int x, int y, int dir){
        if( x == N-1 && y == N-1) {
            count++;
            return;
        }

        if(dir == 0){
            if( y + 1 < N && map[x][y+1] == 0) dfs(x,y+1,0);
        }
        else if(dir == 1){
            if(x + 1 < N && map[x+1][y] == 0) dfs(x+1, y, 1);
        }
        else if(dir == 2){
            if(y+1 < N && map[x][y+1] == 0) dfs(x, y + 1, 0);

            if(x+1 < N && map[x+1][y] == 0) dfs(x+1, y , 1);
        }
        if (x + 1 < N && y + 1 < N && map[x][y + 1] == 0 && map[x + 1][y] == 0 && map[x + 1][y + 1] == 0) {
            dfs(x + 1, y + 1, 2);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        StringTokenizer st;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,1,0);

        System.out.print(count);
    }
}
