package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon_5052 {
    public static boolean checkNumber(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            String before = arr[i];
            String after = arr[i+1];
            if(!before.equals(after)){
                if(after.startsWith(before)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < testCase; i++) {
            int num = Integer.parseInt(br.readLine());
            String[] arr = new String[num];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = br.readLine();
            }
            Arrays.sort(arr);
            if (checkNumber(arr)) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}
