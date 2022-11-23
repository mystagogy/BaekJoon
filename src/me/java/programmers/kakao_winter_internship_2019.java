package me.java.programmers;

import java.util.Stack;

public class kakao_winter_internship_2019 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int location : moves){
            for(int i = 0; i < board.length; i++){
                if(board[i][location-1] != 0){
                    if(!stack.isEmpty()){
                        if(stack.peek().equals(board[i][location-1])){
                            stack.pop();
                            answer+=2;
                        }else
                            stack.push(board[i][location-1]);
                    }else {
                        stack.push(board[i][location-1]);
                    }
                    board[i][location-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
