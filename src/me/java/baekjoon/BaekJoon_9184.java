package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_9184 {

    static int arr[][][] = new int[21][21][21];
    StringBuilder sb = new StringBuilder();
    static int w(int a, int b, int c){
        if(a<=0 || b<=0 || c<=0) return 1;

        else if(a>20 || b>20 || c>20) return arr[20][20][20] = w(20,20,20);

        else if(arr[a][b][c] !=0) return arr[a][b][c];

        else if(a<b && b<c) return arr[a][b][c] = w(a,b,c-1) + w(a,b-1,c-1) - w(a, b-1,c);

        else return  arr[a][b][c] =  w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (true){
            String str = br.readLine();
            if(str.equals("-1 -1 -1")) break;
            st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int result = w(a,b,c);
            sb.append("w("+a+", "+b+", "+c+") = " + result +"\n");

        }
        System.out.println(sb);
    }
}
