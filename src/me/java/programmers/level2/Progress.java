package me.java.programmers.level2;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Progress {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] remain = new int[progresses.length];

        for(int i = 0; i < remain.length; i++){
            if((100-progresses[i]) % speeds[i]==0){
                remain[i] = (100-progresses[i]) / speeds[i];
            }
            else {
                remain[i] = (100-progresses[i]) / speeds[i] + 1;
            }
        }

        Deque<Integer> deque = new LinkedList<>();
        for(int num : remain){
            deque.offer(num);
        }
        List<Integer> list = new ArrayList<>();
        while (!deque.isEmpty()){
            int num = deque.poll();
            int count = 1;
            while(!deque.isEmpty() && num > deque.peek()){
                deque.poll();
                count++;
            }
            list.add(count);
        }
        answer = new int[list.size()];
        int i = 0;
        for(int x : list){
            answer[i] = x;
            i++;
        }
        return answer;
    }
}
