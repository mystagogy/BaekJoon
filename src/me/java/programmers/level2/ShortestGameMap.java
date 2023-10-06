package me.java.programmers.level2;
import java.util.*;

public class ShortestGameMap {
    static class Point {
        int x,y, count;
        public Point(int x, int y, int count){
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    public int solution(int[][] maps) {
        int answer = -1;

        int N = maps.length;
        int M = maps[0].length;
        boolean[][] visit = new boolean[N][M];
        visit[0][0] = true;

        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(0,0,1));
        while(!q.isEmpty()){
            Point p = q.poll();

            if(p.x == N-1 && p.y == M-1){
                answer = p.count;
                return answer;
            }

            for(int i = 0; i < 4; i++){
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M || visit[nx][ny] || maps[nx][ny] == 0) continue;
                visit[nx][ny] = true;
                q.offer(new Point(nx, ny, p.count+1));
            }
        }
        return answer;
    }
}
