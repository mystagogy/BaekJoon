package me.java.programmers.level2;

import java.util.Arrays;
import java.util.HashMap;

public class H_Index {
    public static int solution(int[] citations) {
        int answer = 0;

        int h = citations.length;
        for(int citation : citations){
            if(h <= citation){answer++;}
        }

        if(answer==h) return answer;

        Arrays.sort(citations);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < citations.length; i++){
            hashMap.put(i, citations[citations.length-1-i]);
        }

        for(int num : hashMap.keySet()){
            if(num >= hashMap.get(num)){
                return num;
            }
        }

        return answer;
    }
}
