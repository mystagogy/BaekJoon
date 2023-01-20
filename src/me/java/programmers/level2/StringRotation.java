package me.java.programmers.level2;

import java.util.Stack;

public class StringRotation {
    public static boolean Check (String str){
        Stack<Character> s = new Stack<>();

        char[] arr = str.toCharArray();

        for(char data:arr){
            if(s.isEmpty()){
                s.push(data);
            }
            else if(s.peek()=='['&&data==']'){
                s.pop();
            }
            else if(s.peek()=='('&&data==')'){
                s.pop();
            }
            else if(s.peek()=='{'&&data=='}'){
                s.pop();
            }
            else{
                s.push(data);
            }
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }
    public static int solution(String s) {
        int answer = 0;
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(0);
            s = s.substring(1)+temp;
            if(Check(s)){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
    }
}
