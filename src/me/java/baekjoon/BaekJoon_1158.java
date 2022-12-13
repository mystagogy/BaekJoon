package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= num; i++){
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int count = 0;
        while (!queue.isEmpty()){
            if(count == index -1){
                sb.append(queue.poll()).append(", ");
                count = 0;
            }
            else{
                queue.add(queue.poll());
                count++;
            }
        }
        sb.delete(sb.length()-2,sb.length()).append(">");

        System.out.println(sb);
    }
}
