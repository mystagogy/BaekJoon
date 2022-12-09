package me.java.programmers.level2;

import java.util.*;

public class MakeMin {
    public static int solution(int []A, int []B)
    {
        int answer = 0;
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();
        for(int x : A){
            aList.add(x);
        }
        for(int x : B){
           bList.add(x);
        }

        aList.sort(Comparator.reverseOrder());
        Collections.sort(bList);
        for(int i = 0; i < aList.size(); i++){
            answer += (aList.get(i) * bList.get(i));
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,4,2}, new int[]{5,4,4}));
        System.out.println(solution(new int[]{1,2}, new int[]{3,4}));
    }
}
