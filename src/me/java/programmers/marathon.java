package me.java.programmers;


import java.util.HashMap;

public class marathon {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashmap = new HashMap<>();
        for(String participants : participant){
            hashmap.put(participants, hashmap.getOrDefault(participants, 0)+1);
        }
        for(String completions : completion){
            hashmap.put(completions, hashmap.getOrDefault(completions, 0)-1);
        }
        for(String key : hashmap.keySet()){
            if(hashmap.get(key) > 0)
                answer = key;
        }
        return answer;
    }
}
