package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class BaekJoon_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) > Math.abs(o2)){
                    return 1;
                }
                else if(Math.abs(o1) == Math.abs(o2)){
                    return o1 - o2;
                }
                else {
                    return -1;
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num; i++){
            int x = Integer.parseInt(br.readLine());
            if(x==0 && !queue.isEmpty()){
                sb.append(queue.poll()).append("\n");
            }
            else if(x==0 && queue.isEmpty()){
                sb.append(0).append("\n");
            }
            else{
                queue.offer(x);
            }
        }
        System.out.println(sb);
    }
}
