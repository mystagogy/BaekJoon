package me.java.baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_10815 {
    public static int binarySearch(int[] N_arr, int num){
        int mid;
        int left = 0;
        int right = N_arr.length-1;
        while(left <= right){
            mid = (left + right)/2;
            if(N_arr[mid] == num){
                return 1;
            }
            if(num < N_arr[mid]){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return  0;
    }
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] N_arr = {};
        int[] M_arr = {};
        try{
            int N = Integer.parseInt(br.readLine());
            N_arr = new int[N];
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int i = 0;
            while(st.hasMoreTokens()){
                N_arr[i] = Integer.parseInt(st.nextToken());
                i++;
            }

            int M = Integer.parseInt(br.readLine());
            M_arr = new int[M];
            String str2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(str2);
            int j = 0;
            while (st2.hasMoreTokens()){
                M_arr[j] = Integer.parseInt(st2.nextToken());
                j++;
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            int[] result = new int[M_arr.length];
            Arrays.sort(N_arr);
            for(int i = 0; i < M_arr.length; i++){
                result[i] = binarySearch(N_arr, M_arr[i]);
            }
            for(int num : result){
                System.out.print(num + " ");
            }
        }
    }
}
