package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class BaekJoon_2485 {
    static int GCD(int a, int b){
        if(a <= b){
            int tmp = a;
            a = b;
            b =tmp;
        }
        if(b==0) return a;
        else return GCD(b, a%b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int[] gap = new int[N-1];
        for(int i = 0; i < gap.length; i++){
            gap[i] = arr[i+1] - arr[i];
        }
        for(int i = 1; i < gap.length; i++){
            gap[i] = GCD(gap[i], gap[i-1]);
        }

        int result = gap[gap.length-1];

        System.out.println((arr[N-1] - arr[0])/result - arr.length +1);


    }
}
