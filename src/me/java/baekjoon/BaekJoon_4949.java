package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon_4949 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character>stack = new Stack<>();
        try{
            while(true){
                String str = br.readLine();
                if(str.equals(".")){
                    return;
                }
                for (int i = 0; i < str.length(); i++) {
                    if(str.charAt(i) == '(' || str.charAt(i) == '[') {
                        stack.push(str.charAt(i));
                    }else {
                        if(str.charAt(i) == ')') {
                            if(!stack.isEmpty() && stack.peek() == '(') stack.pop();
                            else stack.push(str.charAt(i));
                        } else if( str.charAt(i) == ']') {
                            if(!stack.isEmpty() &&stack.peek() == '[') stack.pop();
                            else stack.push(str.charAt(i));
                        }

                    }
                }
                if(stack.isEmpty()) System.out.println("yes");
                else System.out.println("no");
                str = "";
                stack.clear();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
