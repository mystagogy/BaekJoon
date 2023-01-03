package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class BaekJoon_2164 {
    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i = 1; i <= num; i++){
            deque.offer(i);
        }

        while (deque.size()> 1){
            deque.poll();
            deque.offer(deque.poll());
        }

        System.out.println(deque.poll());
    }
}
