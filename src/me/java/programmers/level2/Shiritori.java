package me.java.programmers.level2;

import java.util.*;

public class Shiritori {
    public int[] solution(int n, String[] words) {
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
    public static int[] solution2(int n, String[] words){
        int[] answer = new int[2];

        Stack<String> stack = new Stack<>();

        int index = 1;
        int count = 1;
        for(String word : words){
            String before = "";
            if(stack.isEmpty()){ stack.push(word);}
            else {
                before = stack.peek();

                if (stack.contains(word) || before.charAt(before.length() - 1) != word.charAt(0)) {
                    answer[0] = index;
                    answer[1] = count;
                    break;
                } else {
                    stack.push(word);
                }
            }
            if(index == n){
                index=1;
                count++;
            }
            else{
                index++;
            }
        }

        return answer;
    }
}
