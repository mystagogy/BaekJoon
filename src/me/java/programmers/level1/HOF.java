package me.java.programmers.level1;

import java.util.*;

public class HOF {
    public static int[] solution(int k, int[] score) {
        int[] answer = {};
        List<Integer>list = new ArrayList<>();
        answer = new int[score.length];
        int i = 0;
        for(int num : score){
            if(list.size() < k){
                list.add(num);
            }else{
                if(list.get(0) < num){
                    list.remove(0);
                    list.add(num);
                }
            }
            Collections.sort(list);
            answer[i] = list.get(0);
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, new int[]{10, 100, 20, 150, 1, 100, 200}));
        System.out.println(solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}));
    }
}
