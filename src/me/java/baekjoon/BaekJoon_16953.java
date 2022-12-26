package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int initial = Integer.parseInt(st.nextToken());
        int result = Integer.parseInt(st.nextToken());
        int count = 1;
        while (initial != result){
            if(result < initial){
                System.out.println(-1);
                return;
            }
            if(result%2==0){
                result /= 2;
            }
            else if(result%10==1){
                result = result/10;
            }
            else{
                System.out.println(-1);
                return;
            }
            count++;
        }
        System.out.println(count);
    }
}
