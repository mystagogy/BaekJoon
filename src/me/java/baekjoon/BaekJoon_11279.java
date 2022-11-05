package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BaekJoon_11279 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        StringBuffer sb = new StringBuffer();
        try{
            int num =Integer.parseInt(br.readLine());
            for(int i = 0; i < num; i++){
                int x = Integer.parseInt(br.readLine());
                if( x == 0){
                    if( queue.isEmpty()){
                        sb.append(0).append("\n");
                    }else{
                        sb.append(queue.poll()).append("\n");
                    }
                }
                else {
                    queue.offer(x);
                }
            }
            System.out.println(sb);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
