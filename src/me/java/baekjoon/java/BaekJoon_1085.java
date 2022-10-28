package me.java.baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1085 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x, y, w, h;
        int[] arr = {};
        try{
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            arr = new int[]{x, y, w - x, h - y};
        }
        catch (IOException e){
            e.printStackTrace();
        }
        int min = arr[0];
        for(int num : arr){
            if( num < min)
                min = num;
        }
        System.out.println(min);
    }
}
