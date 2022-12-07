package me.java.programmers;

import java.util.ArrayList;
import java.util.List;

public class binaryTranslation {
    public int[] solution(String s) {
        int[] answer = {};
        int count = 0;
        List<Character> list = new ArrayList<>();

        while (true) {
            for(int i = 0; i < s.length(); i++){
                list.add(s.charAt(i));
            }
            System.out.println(list.size());
            if(list.size()==1) {
                break;
            }
            for(int i = 0; i < list.size(); i++){
                if(list.get(i)=='0'){
                    list.remove(i);
                    count++;
                }
            }
            System.out.println(list);
            s = Integer.toBinaryString(list.size());
            list.clear();

        }
        System.out.println(count);
        return answer;
    }
}
