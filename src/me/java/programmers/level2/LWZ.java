package me.java.programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;


public class LWZ {
    public int[] solution(String msg) {
        int[] answer = {};
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int ind = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (char i = 'A'; i <= 'Z'; i++) {
            map.put(i + "", ind++);
        }
        int size = msg.length();
        for (int i = 0; i < size; i++) {
            int a = 1;
            while (i + a <= size && map.containsKey(msg.substring(i, i + a))) {
                a++;
            }
            if (i + a > size) {
                ans.add(map.get(msg.substring(i)));
                break;
            }
            ans.add(map.get(msg.substring(i, i + a - 1)));
            map.put(msg.substring(i, i + a), ind++);
            if (a > 1) i += a - 2;
        }

        answer = new int[ans.size()];
        int i = 0;
        for (int x : ans) {
            answer[i] = x;
            i++;
        }

        return answer;
    }
}