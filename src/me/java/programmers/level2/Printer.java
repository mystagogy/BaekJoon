package me.java.programmers.level2;

import java.util.*;

public class Printer {
    public static int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for(int x : priorities){
            queue.add(x);
        }

        System.out.println(queue);

        while (!queue.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(queue.peek()==priorities[i]){
                    queue.poll();
                    answer++;
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2},2));
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1},0));
    }
}
