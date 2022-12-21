package me.java.programmers.level2;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Greedy {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        Deque<Integer> deque = new LinkedList<>();

        for(int weight : people){
            deque.add(weight);
        }

        if(deque.peekFirst() > limit/2){
            answer = deque.size();
        }
        else{
            while(!deque.isEmpty()){
                int weight = deque.pollLast();
                if(!deque.isEmpty() && weight+deque.peekFirst() <= limit){
                    deque.pollFirst();
                }
                answer++;
            }
        }

        return answer;
    }
}
