package me.java.programmers.level1;

import java.util.Stack;

public class MakeBugar {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int x : ingredient){
            if(stack.size()<3){
                stack.add(x);
            }
            else{
                int top = stack.peek();
                if(top == 3 && x == 1 && (stack.get(stack.size()-2)==2 && stack.get(stack.size()-3)==1)){
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    answer++;
                    }
                else{
                    stack.add(x);
                }
            }
        }
        return answer;
    }
}
