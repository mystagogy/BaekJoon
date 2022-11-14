package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class BaekJoon_9012 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        try {
            int num = Integer.parseInt(br.readLine());
            for (int i = 0; i < num; i++) {
                String str = br.readLine();
                for (int j = 0; j < str.length(); j++) {
                    char ch = str.charAt(j);

                    if(ch == '(') {
                        stack.push(ch);
                    }
                    else {
                        int size = stack.size();
                        if(size == 0) {
                            stack.push(ch);
                            break;
                        }
                        else {
                            stack.pop();
                        }
                    }
                }

                if(stack.isEmpty()) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }

                stack.clear();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
