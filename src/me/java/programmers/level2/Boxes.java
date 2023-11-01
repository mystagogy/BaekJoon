package me.java.programmers.level2;

import java.util.Stack;

public class Boxes {
    public int solution(int[] order) {

        int[] rank = new int[order.length];

        for(int i = 0; i < order.length; i++){
            rank[order[i]-1] = i;
        }

        Stack<Integer> belt = new Stack<>();

        int index = 0;

        for(int i = 0; i < rank.length; i++){
            if(rank[i] == index) index++;
            else belt.push(rank[i]);

            while(!belt.isEmpty() && belt.peek() == index){
                belt.pop();
                index++;
            }
        }
        return index;
    }
}
