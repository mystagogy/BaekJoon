package me.java.programmers.level2;


import java.util.*;

public class Tuple {
    public int[] solution(String s) {
        int[] answer = {};
        s = s.substring(1,s.length()-1);
        StringTokenizer st = new StringTokenizer(s,"{");
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, String> hashMap = new HashMap<>();
        while(st.hasMoreTokens()) {
            String tmp = st.nextToken().replaceAll("[}]", "");
            hashMap.put(tmp.length(), tmp);
        }
        Object[] length = hashMap.keySet().toArray();
        Arrays.sort(length);
        for(Object o : length){
            String result = hashMap.get(o);
            String[] str = result.split(",");
            for(String temp : str){
                int x = Integer.parseInt(temp);
                if(!list.contains(x)){
                    list.add(x);
                }
            }
        }
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
