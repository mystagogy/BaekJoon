package me.java.programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class SplitArray {
    public int[] solution(int n, long left, long right) {
        int[] answer = {};
        answer = new int[(int) (right-left+1)];
        List<Long> list = new ArrayList<>();

        for(long i=left;i<right+1;i++){
            list.add(Math.max(i/n,i%n) + 1);
        }
        int i = 0;
        for(long l : list){
            answer[i] = (int) l;
            i++;
        }
        return answer;
    }
}
