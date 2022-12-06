package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 =Integer.parseInt(st.nextToken());
            int y1 =Integer.parseInt(st.nextToken());
            int r1 =Integer.parseInt(st.nextToken());
            int x2 =Integer.parseInt(st.nextToken());
            int y2 =Integer.parseInt(st.nextToken());
            int r2 =Integer.parseInt(st.nextToken());
            int x = (int)Math.pow((x1-x2),2);
            int y = (int)Math.pow((y1-y2),2);
            int distance = x+y;

            if(x1 == x2 && y1 == y2 && r1 == r2) {
                sb.append("-1").append("\n");
            }

            else if(distance > Math.pow(r1 + r2, 2)) {
                sb.append("0").append("\n");
            }

            else if(distance < Math.pow(r2 - r1, 2)) {
                sb.append("0").append("\n");
            }

            else if(distance == Math.pow(r2 - r1, 2)) {
                sb.append("1").append("\n");
            }

            else if(distance == Math.pow(r1 + r2, 2)) {
                sb.append("1").append("\n");
            }

            else {
                sb.append("2").append("\n");
            }
        }
        System.out.println(sb);
    }
}
