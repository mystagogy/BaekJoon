package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < num; i++){
            pq.clear();
            list.clear();
            int answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < count; j++){
                int x = Integer.parseInt(st.nextToken());
                list.add(x);
                pq.add(x);
            }

            while (!pq.isEmpty()){
                for(int k = 0; k < list.size(); k++){
                    if(pq.peek()==list.get(k)){
                        pq.poll();
                        answer++;
                        if (k == index) {

                            sb.append(answer).append("\n");
                        }
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }
}
