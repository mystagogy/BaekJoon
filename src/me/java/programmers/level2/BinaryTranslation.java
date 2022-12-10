package me.java.programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class BinaryTranslation {
    public static int[] solution(String s) {
        int[] answer = {};
        List<Character> list = new ArrayList<>();
        answer = new int[2];
        boolean state = true;
        int zero = 0;
        int count = 0;
        while (state){
            list.clear();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '1') {
                    list.add(s.charAt(i));
                }
                else{
                    zero++;
                }
            }
            int length = list.size();
            s = Integer.toBinaryString(length);
            count++;
            if(s.equals("1")){
                state = false;
            }
        }
        answer[0] = count;
        answer[1] = zero;


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("110010101001"));
    }
}
