package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_10448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] arr= new int[50];
        for(int i=1; i<50; i++){
            arr[i] = i*(i+1)/2;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            boolean status = true;
            int result = 0;
            while (status){
                for(int x=1; x<50; x++){
                    for(int y=1; y<50; y++){
                        for(int z=1; z<50; z++){
                            if(arr[x]+arr[y]+arr[z]==N) {
                                result = 1;
                            }
                            else{
                                status = false;
                            }
                        }
                    }
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
