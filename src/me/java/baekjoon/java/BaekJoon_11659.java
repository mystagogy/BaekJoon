package me.java.baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_11659 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {};
        try{
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int num = Integer.parseInt(st.nextToken());
            int times = Integer.parseInt(st.nextToken());
            arr = new int[num+1];
            arr[0] = 0;
            String nums = br.readLine();
            st = new StringTokenizer(nums);
            for(int i = 1; i < arr.length; i++){
                arr[i] = arr[i-1]+Integer.parseInt(st.nextToken());
            }
            for(int i = 0; i < times; i++){
                String range = br.readLine();
                st = new StringTokenizer(range);
                int sum = 0;
                int j = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());
                sum = arr[k] - arr[j-1];
                System.out.println(sum);
            }


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
