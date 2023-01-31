package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        long end = (long)arr[N-1];
        long start = 0;
        long count, mid;

        while(start<end) {
            count = 0;
            mid=(start+end)/2;


            for(int line : arr){
                if(line > mid) {
                    count += line-mid;
                }
            }

            if(count<M) end = mid;
            else start = mid+1;
        }
        System.out.println(start-1);
    }
}
