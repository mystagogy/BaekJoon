package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2579 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {};
        int [] result = {};
        try {
            int num = Integer.parseInt(br.readLine());
            arr = new int[num+1];
            for(int i = 1; i < arr.length; i++){
                arr[i] = Integer.parseInt(br.readLine());
            }
            result = new int[num+1];
            result[0] = arr[0];
            result[1] = arr[1];
            if(num >= 2){
                result[2] = arr[1] + arr[2];
            }
            for(int i = 3; i <= num; i++){
                result[i] = Math.max(result[i-2], result[i-3]+arr[i-1]) + arr[i];
            }
            System.out.println(result[num]);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
