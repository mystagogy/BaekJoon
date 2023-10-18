package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_3226 {
    static int sum = 0;
    static int N;
    static final int day = 10;
    static final int night = 5;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (N --> 0){
            st = new StringTokenizer(br.readLine());
            String[] start = st.nextToken().split(":");
            int hour = Integer.parseInt(start[0]);
            int minute = Integer.parseInt(start[1]);

            int time = Integer.parseInt(st.nextToken());

            if(hour >= 7 && hour < 19) {
                if(hour == 18 && minute + time > 60) sum += (60-minute) * day + (minute+time-60) * night;
                else sum += time*day;
            }
            else {
                if(hour == 6 && minute + time > 60) sum += (60-minute) * night + (minute+time-60) * day;
                else sum += time*night;
            }
        }
        System.out.print(sum);
    }
}
