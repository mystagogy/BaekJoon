package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[][] timetable = new int[num][2];

        int min = 0;
        int max = 0;
        for(int i = 0; i < num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            timetable[i][0] = Integer.parseInt(st.nextToken());
            timetable[i][1] = Integer.parseInt(st.nextToken());
            if(timetable[i][0] < min) { min = timetable[i][0];}
            if(timetable[i][1] > max) { max = timetable[i][1];}
        }


        Arrays.sort(timetable, (o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]);

        int count = 0;
        int end = 0;
        for(int[] time : timetable){
            if(time[0]>=end){
                end = time[1];
                count++;
            }
        }
        System.out.println(count);
    }
}
