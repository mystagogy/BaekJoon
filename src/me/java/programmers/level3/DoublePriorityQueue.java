package me.java.programmers.level3;

import java.util.Collections;
import java.util.PriorityQueue;

public class DoublePriorityQueue {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> max = new PriorityQueue(Collections.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue();

        for(String operation : operations){
            String[] str = operation.split(" ");
            int x = Integer.parseInt(str[1]);
            if(str[0].equals("I")){
                max.add(x);
                min.add(x);
            }else{
                if(x == -1)
                    max.remove(min.poll());
                else
                    min.remove(max.poll());
            }
        }
        answer[0] = max.isEmpty() ? 0 : max.peek();
        answer[1] = min.isEmpty() ? 0 : min.peek();
        return answer;
    }
}
