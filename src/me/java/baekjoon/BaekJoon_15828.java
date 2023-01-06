package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon_15828 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        boolean status = true;
        while (status){
            int num = Integer.parseInt(br.readLine());
            if(num==-1) {
                status = false;
                break;
            }
            if(num==0) queue.poll();
            else if(queue.size() < size ) queue.offer(num);
        }
        StringBuilder sb = new StringBuilder();
        if(queue.isEmpty()) System.out.println("empty");
        else {
            for(int x : queue){
                sb.append(x).append(' ');
            }
            System.out.println(sb.toString().substring(0,sb.length()-1));

        }
    }
}
