package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1992 {
    public static int[][] map;
    public static StringBuilder sb = new StringBuilder();

    static void QuadTree(int x, int y, int size) {

        if(check(x, y, size)) {
            sb.append(map[x][y]);
            return;
        }

        int newSize = size / 2;

        sb.append('(');

        QuadTree(x, y, newSize);
        QuadTree(x, y + newSize, newSize);
        QuadTree(x + newSize, y, newSize);
        QuadTree(x + newSize, y + newSize, newSize);

        sb.append(')');
    }


    static boolean check(int x, int y, int size) {
        int value = map[x][y];

        for(int i = x; i < x + size; i++) {
            for(int j = y; j < y + size; j++) {
                if (value != map[i][j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for(int i = 0; i < N; i++) {

            String str = br.readLine();

            for(int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        QuadTree(0, 0, N);
        System.out.println(sb);
    }
}
