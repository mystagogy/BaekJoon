package me.java.programmers.level2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Cache {
    public static  int solution(int cacheSize, String[] cities) {
        int answer = 0;
        HashMap<String, Integer> hashMap = new HashMap<>();
        int index = 0;
        String LRU = "";
        for(String city : cities){
            if(cacheSize==0){
                answer+=5;
            }
           if(hashMap.containsKey(city.toLowerCase())){
               answer += 1;
               hashMap.replace(city, index);
           }
           else{
               if(hashMap.size() < cacheSize){
                   hashMap.put(city,index);
               }
               else{
                   hashMap.remove(LRU);
                    hashMap.put(city, index);
               }
               answer += 5;
           }
            List<Integer> valueList = new ArrayList<>(hashMap.values());
            valueList.sort(Integer::compareTo);
            for(String key : hashMap.keySet()){
                if(hashMap.get(key)==valueList.get(0)){
                    LRU = key;
                }
            }
           index++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3,new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }
}
