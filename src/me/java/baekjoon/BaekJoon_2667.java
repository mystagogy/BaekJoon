package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_2667 {
    static int N,buildNum=0;
    static int dx[]= {-1,1,0,0};
    static int dy[]= {0,0,-1,1};
    static int[] buildings;
    static int[][] map;
    static boolean [][] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        buildings = new int[N*N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();
            for (int j = 0; j < N; j++) {
                map[i][j] = temp.charAt(j)-'0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                //step1
                if(map[i][j]==1 && !visited[i][j]) {
                    buildNum++;
                    dfs(i,j);
                }
            }
        }

        Arrays.sort(buildings);
        System.out.println(buildNum);

        for (int i = 0; i < buildings.length; i++) {
            if(buildings[i]==0) {
                continue;
            }else {
                System.out.println(buildings[i]);
            }
        }

    }

    private static void dfs(int i, int j) {
        visited[i][j] = true;
        buildings[buildNum]++;

        for (int k = 0; k < 4; k++) {
            int x = i+dx[k];
            int y = j+dy[k];

            if(x>=0 && y>=0 && x<N&& y<N) {
                if(map[x][y] ==1 && !visited[x][y]) {
                    dfs(x,y);
                }
            }
        }
    }
}
