package me.java.programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Shiritori {
    public static int[] solution(int n, String[] words) {
        int[] answer = {};
        answer = new int[2];

        HashMap<Integer, Queue<String >> hashMap = new HashMap<>();

        for(int i = 0; i < n; i++){
            Queue<String> queue = new LinkedList<>();
            for(int j = 0; j < words.length/n; j++){
                queue.add(words[n*j+i]);
            }
            hashMap.put(i+1, queue);
        }

        ArrayList<String> list = new ArrayList<>();
        int index = 1;
        int count = 1;
        for(int i =1; i <= words.length; i++){
            if(list.isEmpty()){
                list.add(hashMap.get(index).poll());
            }
            else{
                String before = list.get(list.size()-1);
                String after = hashMap.get(index).peek();
                if(before.charAt(before.length()-1)!=after.charAt(0) || list.contains(after)){
                    answer[0] = index;
                    answer[1] = count;
                    break;
                }
                else{
                    list.add(hashMap.get(index).poll());
                }
            }
            if(index==n){
                index=1;
                count++;
            }
            else{
                index++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}));

        System.out.println(solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"}));

        System.out.println(solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"}));
    }
}
