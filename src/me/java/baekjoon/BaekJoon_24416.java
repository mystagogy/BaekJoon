package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_24416 {
    static int recur_count = 0;
    static int dp_count = 0;
    static int fib(int n){
        if(n==1 || n==2) {
            recur_count++;
            return 1;
        }
        else return fib(n-1) + fib(n-2);
    }
    static int fibonacci(int n){
        int [] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i < arr.length; i++){
            arr[i] = arr[i-1] + arr[i-2];
            dp_count++;
        }
        return arr[n-1];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        fib(N);
        fibonacci(N);
        sb.append(recur_count).append("\n").append(dp_count);
        System.out.println(sb);
    }
}
