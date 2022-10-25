package me.java.programmers;

import java.util.ArrayList;
import java.util.List;

public class harshadNumber {
    public static boolean solution(int x) {
        boolean answer = true;
        String str = String.valueOf(x);
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            list.add(str.charAt(i));
        }
        int num = 0;
        for (Character character : list) {
            num += Character.getNumericValue(character);
        }
        answer = (x % num == 0);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(12));
    }
}
