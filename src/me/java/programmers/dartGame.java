package me.java.programmers;

import java.util.Arrays;

public class dartGame {
    public static int solution(String dartResult) {
        int answer = 0;
        String[] str = new String[dartResult.length()];
        int[] cal = new int[3];
        int count = 0;
        for(int i = 0; i < str.length; i++){
            if(dartResult.charAt(i) == '0'){
                if(i != 0){
                    if(dartResult.charAt(i-1) == '1'){
                        str[i] = "10";
                        i++;
                    }
                }
            }
            str[i] = Character.toString(dartResult.charAt(i));
        }
        System.out.println(Arrays.toString(str));
        for(int i = 0; i < str.length; i++){
            if(str[i].equals("S")){
                System.out.println(str[i-1] +"," + str[i]);
                cal[count] = (int)Math.pow(Integer.parseInt(str[i-1]),1);
                count++;
            }
            else if(str[i].equals("D")){
                System.out.println(str[i-1] +"," + str[i]);
                cal[count] = (int)Math.pow(Integer.parseInt(str[i-1]),2);
                count++;
            }
            else if(str[i].equals("T")){
                System.out.println(str[i-1] +"," + str[i]);
                cal[count] = (int)Math.pow(Integer.parseInt(str[i-1]),3);
                count++;
            }

            System.out.println(count);
            if(str[i].equals("*")){
                if(count == 1 ){
                    cal[count-1] *= 2;
                }
                else{
                    cal[count-2] *= 2;
                    cal[count-1] *= 2;
                }
            }
            else if(str[i].equals("#")){
                cal[count-1] *= (-1);
            }
            System.out.println(Arrays.toString(cal));


        }
        for(int x : cal){
            answer+=x;
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("1D2S#10S");
    }
}
