package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_4948 {
    static int primeNumber(int n) {
        boolean[] arr = new boolean[n*2+1];
        arr[0]=true;
        arr[1]=true;
        for(int i=2;i<=n*2;i++) {
            if(arr[i])continue;
            for(int j=i+i; j<=n*2; j+=i) {
                arr[j]=true;
            }
        }

        int count =0;
        for(int i=n+1;i<=n*2;i++) {
            if(!arr[i])count++;
        }

        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean status = true;
        StringBuilder sb = new StringBuilder();
        while (status){
            int n = Integer.parseInt(br.readLine());
            if(n==0) {
                status = false;
                break;
            }
            sb.append(primeNumber(n)).append("\n");
        }
        System.out.println(sb);
    }
}
