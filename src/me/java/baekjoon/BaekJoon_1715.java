package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BaekJoon_1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < num; i++){
            queue.add(Integer.parseInt(br.readLine()));
        }

        int sum = 0;
        while (queue.size()> 1){
            int a = queue.poll();
            int b = queue.poll();
            sum += a+b;
            queue.add(a+b);
        }
        System.out.println(sum);
    }
}
