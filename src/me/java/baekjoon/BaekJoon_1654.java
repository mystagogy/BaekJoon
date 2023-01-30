package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class BaekJoon_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfLines = Integer.parseInt(st.nextToken());
        int result = Integer.parseInt(st.nextToken());

        int[] lines = new int[numOfLines];
        for(int i = 0; i < numOfLines; i++){
            lines[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(lines);

        long end = lines[numOfLines-1];
        long start = 1;
        long count, mid;

        while(start<=end) {
            count = 0;
            mid=(start+end)/2;

            for(int line : lines){
                count += line/mid;
            }
            if(count<result) end = mid-1;
            else start = mid+1;
        }

        System.out.println(end);
    }
}
