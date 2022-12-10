package me.java.programmers.level1;

public class FoodFighter {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i < food.length; i++){
            String str = String.valueOf(i).repeat(food[i]/2);
            answer += str;
        }
        answer += "0";

        for(int i = answer.length()-2; i > -1; i--){
            answer += answer.charAt(i);
        }
        return answer;
    }
}
