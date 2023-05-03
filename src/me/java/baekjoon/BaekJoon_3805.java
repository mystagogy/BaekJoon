package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_3805 {
    public static int calcScore(char[][] map) {
        int N = map.length;
        int maxScore = 0;
        for (int r = 0; r < N; r++) {
            int scr = 1;
            for (int c = 1; c < N; c++) {
                if (map[r][c] == map[r][c - 1]) scr++;
                else {
                    maxScore = Math.max(maxScore, scr);
                    scr = 1;
                }
            }
            maxScore = Math.max(maxScore, scr);
        }
        for (int c = 0; c < N; c++) {
            int scr = 1;
            for (int r = 1; r < N; r++) {
                if (map[r][c] == map[r - 1][c]) scr++;
                else {
                    maxScore = Math.max(maxScore, scr);
                    scr = 1;
                }
            }
            maxScore = Math.max(maxScore, scr);
        }
        return maxScore;
    }

    public static void swap(char[][] map, int r1, int c1, int r2, int c2) {
        char tmp = map[r1][c1];
        map[r1][c1] = map[r2][c2];
        map[r2][c2] = tmp;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        char[][] map = new char[T][T];
        for(int i = 0; i < T; i++){
            map[i] = br.readLine().toCharArray();
        }

        int result = 0;
        for (int i = 0; i < T; i++)
            for (int j = 0; j < T; j++){

                if (j + 1 < T) {
                    swap(map, i, j, i, j + 1);
                    result = Math.max(result, calcScore(map));
                    swap(map, i, j, i, j + 1);
                }

                if (i + 1 < T) {
                    swap(map, i, j, i + 1, j);
                    result = Math.max(result, calcScore(map));
                    swap(map, i, j, i + 1, j);
                }
            }
        System.out.println(result);
    }
}
