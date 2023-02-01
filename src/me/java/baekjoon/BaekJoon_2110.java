package me.java.baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_2110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int start = 1;
        int end = arr[N-1] - arr[0];

        int result = 0;

        while (start<=end){
            int mid = (start + end) / 2;
            int left = arr[0];
            int count = 1;

            for(int i =1; i < N; i++){
                if(arr[i]-left >= mid){
                    count++;
                    left = arr[i];
                }
            }
            if(count >= C){
                result = mid;
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        System.out.println(result);

    }
}
