package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_13223 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] now = br.readLine().split(":");
        String[] time = br.readLine().split(":");

        int nowHour = Integer.parseInt(now[0]);
        int nowMinute = Integer.parseInt(now[1]);
        int nowSecond = Integer.parseInt(now[2]);

        int timeHour = Integer.parseInt(time[0]);
        int timeMinute = Integer.parseInt(time[1]);
        int timeSecond = Integer.parseInt(time[2]);

        int nowSecondAmount = nowHour * 3600 + nowMinute * 60 + nowSecond;
        int timeSecondAmount = timeHour * 3600 + timeMinute * 60 + timeSecond;

        int NeedSecondAmount = timeSecondAmount - nowSecondAmount;
        if (NeedSecondAmount <= 0) NeedSecondAmount += 24 * 3600;

        int needHour = NeedSecondAmount / 3600;
        int needMinute = (NeedSecondAmount % 3600) / 60;
        int needSecond = NeedSecondAmount % 60;

        System.out.println(String.format("%02d:%02d:%02d", needHour, needMinute, needSecond));
    }
}
