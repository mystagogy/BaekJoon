package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_14502 {

    private static int N;
    private static int M;
    private static String[][] map;
    private static String[][] copyMap;

    private static int MAX;

    private static int[] dx = {1,-1,0,0};
    private static int[] dy = {0,0,1,-1};

    public static void block(int count){

        if(count==3){
            createCopyMap();
            dfs();
            countSafety();
            return;
        }

        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                if(map[i][j].equals("0")){
                    map[i][j] = "1";
                    block(count+1);
                    map[i][j] = "0";
                }
            }
        }
    }
    public static void createCopyMap(){

        for(int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                copyMap[i][j] = map[i][j];
            }
        }
    }

    public static void dfs(){

        for(int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(copyMap[i][j].equals("2")){
                    infect(i,j);
                }
            }
        }
    }

    public static void infect(int x, int y){

        copyMap[x][y] = "2";

        for(int i = 0; i < dx.length; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];

            if(newX >= 0 && newY >= 0 && newX < N && newY < M ){
               if( copyMap[newX][newY].equals("0")){
                   infect(newX,newY);
               }
            }
        }
    }

    public static void countSafety(){

        int count = 0;

        for(int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(copyMap[i][j].equals("0")) { count++;}
            }
        }
        MAX = Math.max(MAX,count);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new String[N][M];
        copyMap = new String[N][M];

        for(int i = 0; i < map.length; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < map[i].length; j++){
                map[i][j] = st.nextToken();
            }
        }

        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                if(map[i][j].equals("0")){
                    map[i][j] = "1";
                    block(1);
                    map[i][j] = "0";
                }
            }
        }
        System.out.println(MAX);
    }
}
