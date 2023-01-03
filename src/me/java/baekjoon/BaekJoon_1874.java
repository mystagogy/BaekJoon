package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class BaekJoon_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int num = Integer.parseInt(br.readLine());
        int index = 0;
        StringBuilder sb= new StringBuilder();

        for(int i = 0; i < num; i++){

            int x = Integer.parseInt(br.readLine());

            if(x > index){
                for(int j = index+1; j <= x; j++){

                    stack.push(j);
                    sb.append("+").append("\n");
                }
                index = x;
            }

            if(x != stack.peek()){
                System.out.println("NO");
                System.exit(0);
            }

            else{
                stack.pop();
                sb.append("-").append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
