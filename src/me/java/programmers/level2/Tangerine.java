package me.java.programmers.level2;


import java.util.*;

public class Tangerine {
    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int x : tangerine){
            hashMap.put(x,hashMap.getOrDefault(x,0)+1);
        }

        List<Integer> list = new ArrayList<>(hashMap.keySet());
        Collections.sort(list, (o1, o2) -> Double.compare( hashMap.get(o2), hashMap.get(o1) ) );

        int sum = 0;
        for(int key : list){
            sum += hashMap.get(key);
            answer++;
            if(sum >= k){
                return answer;
            }
        }
        return answer;
    }
}
