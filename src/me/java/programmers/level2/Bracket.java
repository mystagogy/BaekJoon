package me.java.programmers.level2;

import java.util.Stack;

public class Bracket {
    static boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(c);
            }
            else{
                if(c=='('){
                    stack.push(c);
                }
                else{
                    if(stack.peek()=='('){
                        stack.pop();
                    }
                    else{
                        stack.push(c);
                    }
                }
            }
        }

        if(stack.size() != 0) answer = false;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
    }
}
