package me.java.programmers.level2;

public class Investing {
    public int[] solution(int[] prices) {
        int[] answer = {};
        answer = new int[prices.length];

        for(int i = 0; i < prices.length; i++){
            int count = 0;
            for(int j = i+1; j < prices.length; j++){
                if(prices[i]>=prices[j]){
                    count++;
                }
            }
            answer[i] = count;
            System.out.println(count);
        }
        return answer;
    }
}
