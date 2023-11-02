package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_8911 {
    static int [] dx = {-1,0,1,0};
    static int [] dy = {0,1,0,-1};

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int minX = 0, minY = 0, maxX = 0, maxY = 0, dir = 0, nowX = 0, nowY = 0; //초기값 북쪽

            String command = br.readLine();

            for (int j = 0; j < command.length(); j++) {
                char c = command.charAt(j);

                if (c == 'F') {
                    nowX = nowX + dx[dir];
                    nowY = nowY + dy[dir];
                } else if (c == 'B') {
                    nowX = nowX - dx[dir];
                    nowY = nowY - dy[dir];
                } else if (c == 'L') {
                    dir = (dir+1)%4;
                } else if (c == 'R') {
                    dir = (dir+3)%4;
                }

                minX = Math.min(minX, nowX);
                minY = Math.min(minY, nowY);
                maxX = Math.max(maxX, nowX);
                maxY = Math.max(maxY, nowY);
            }
            sb.append((Math.abs(maxX - minX)) * (Math.abs(maxY - minY))).append("\n");
        }
        System.out.print(sb);
    }
}
