package me.java.programmers.level1;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NumberPair {
    public static String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        int[] x = new int[10];
        int[] y = new int[10];

        for(int i = 0; i < X.length(); i++){
            int num = X.charAt(i) - '0';
            x[num]++;
        }

        for(int i = 0; i < Y.length(); i++){
            int num = Y.charAt(i) - '0';
            y[num]++;
        }

        for(int i = x.length-1; i > -1; i--){
            while(x[i] > 0 && y[i] > 0){
                x[i]--;
                y[i]--;

                sb.append(i);
            }
        }

        answer = sb.toString();

        if(answer.equals("")){
            return "-1";
        }
        else if(answer.startsWith("0")){
            return "0";
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("100","2345"));
        System.out.println(solution("100","203045"));
        System.out.println(solution("100","123450"));
        System.out.println(solution("12321","42531"));
        System.out.println(solution("5255","1255"));
    }
}
