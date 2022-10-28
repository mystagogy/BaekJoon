package me.java.programmers;

import java.util.*;

public class gameFailure {
    static class Info{
        int index;
        double prob;

        public Info(int index, double prob){
            this.index = index;
            this.prob = prob;
        }
    }
    public static int[] solution(int N, int[] stages) {
        int[] answer = {};
        answer = new int[N];
        double[] prob = new double[N];
        List<Info> list = new ArrayList<>();
        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < stages.length; j++){
                if(stages[j]==(i+1)){
                    answer[i]++;
                }
            }
        }
        int sum = 0;
        for(int i = 0; i < answer.length; i++){
            if(answer[i] == 0){
                prob[i] = 0;
            }
            else {
                prob[i] = (double) answer[i]/(stages.length - sum);
                sum += answer[i];
            }
            list.add(new Info(i+1, prob[i]));
        }

        Collections.sort(list, ((o1, o2) -> Double.compare(o2.prob, o1.prob)));

        for(int i = 0; i < list.size(); i ++){
            answer[i] = list.get(i).index;
            System.out.println(answer[i]);
        }


        return answer;
    }

    public static void main(String[] args) {
        int[]arr = {1,2,2,1,3};
        int N = 5;
        solution(N, arr);
    }
}
