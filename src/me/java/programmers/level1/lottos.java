package me.java.programmers.level1;

import java.util.Arrays;

public class lottos {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        answer = new int[2];
        int low = 0;
        int high = 0;
        for(int num : lottos){
            if(num == 0){
                high++;
            }
        }
        if(high==6){
            answer[0] = 1;
            answer[1] = 6;
        }
        else {
            for (int i = 0; i < lottos.length; i++) {
                for (int j = 0; j < win_nums.length; j++) {
                    if (lottos[i] == win_nums[j]) {
                        low++;
                    }
                }
            }
            if(high != 0 || low != 0){
                answer[0] = 7 - (high+low);
                answer[1] = 7 - low;
            }
            else{
                answer[0] = 6;
                answer[1] = 6;
            }
        }
        return answer;
    }
}
