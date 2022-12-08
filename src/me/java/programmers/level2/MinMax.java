package me.java.programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class MinMax {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st= new StringTokenizer(s);
        List<Integer>list = new ArrayList<>();
        while (st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        sb.append(list.get(0)).append(" ").append(list.get(list.size()-1));
        answer = String.valueOf(sb);
        return answer;
    }
}
