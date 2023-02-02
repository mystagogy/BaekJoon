package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] arr = new int[11];

        for(int i = 0; i < str.length(); i++){
            int num = Character.getNumericValue(str.charAt(i));
            if(num == 6 || num == 9) arr[10]++;
            else arr[num]++;
        }

        int index = 0;
        int max = -1;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }

        if(index == 10) {
            max = (max+1)/2;
        }

        System.out.println(max);
    }
}
