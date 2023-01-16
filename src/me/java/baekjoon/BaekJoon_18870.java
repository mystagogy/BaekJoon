package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BaekJoon_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];
        int[] sorted = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sorted[i] = arr[i];
        }

        Arrays.sort(sorted);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int rank = 0;
        for(int x : sorted){
            if(!hashMap.containsKey(x)) {
                hashMap.put(x, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int x : arr){
            sb.append(hashMap.get(x)).append(" ");
        }

        System.out.println(sb);
    }
}
