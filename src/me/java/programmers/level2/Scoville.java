package me.java.programmers.level2;


import java.util.PriorityQueue;


public class Scoville {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int x : scoville){
            queue.offer(x);
        }

        int value = 0;
        while (queue.peek() < K){
            if(queue.size() < 2){
                return -1;
            }
            value = queue.poll() + queue.poll()*2;
            queue.offer(value);
            answer++;
        }
        return answer;
    }

}
