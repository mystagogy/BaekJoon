package me.java.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class integerDescending {
    public static long solution(long n) {
        long answer = 0;
        StringBuilder result = new StringBuilder(String.valueOf(n));
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < result.length(); i++){
            list.add(result.charAt(i));
        }
        result = new StringBuilder();
        list.sort(Collections.reverseOrder());
        for (Character character : list) {
            result.append(character);
        }
        answer = Long.parseLong(result.toString());
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(12));
        System.out.println(solution(3));
        System.out.println(solution(909));
    }
}
