package me.java.programmers.level3;
import java.util.*;
public class BestSet {
    public int[] solution(int n, int s) {
        if(s < n){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[n];
        Arrays.fill(answer,s/n);
        if(s % n != 0) {
            for(int i = 0; i < s%n; i++){
                answer[i]++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
