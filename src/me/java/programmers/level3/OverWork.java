package me.java.programmers.level3;

import java.util.Collections;
import java.util.PriorityQueue;

public class OverWork {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        for(int i = 0; i < works.length; i++) {
            int work = works[i];
            q.offer(work);
            sum += work;
        }

        if(sum <= n) return 0;

        while(n > 0) {
            int work = q.poll();
            work--;
            q.offer(work);
            n--;
        }

        long answer = 0;
        for(int work : q) {
            answer += Math.pow(work,2);
        }
        return answer;
    }
}
