package me.java.programmers.level2;

import java.util.StringTokenizer;

public class JadenCase {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] strings = s.split(" ");
        for(String str : strings){
            boolean state = true;
            while (state){
                if(str.length()==0){
                    sb.append(str);
                    state = false;
                }
                else if(str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'){
                    sb.append(str.charAt(0)).append(str.substring(1).toLowerCase());
                    state = false;
                }
                else if(str.charAt(0) >= 'a' && str.charAt(0) <= 'z'){
                    sb.append(Character.toUpperCase(str.charAt(0))).append(str.substring(1).toLowerCase());
                    state = false;
                }
                else {
                    sb.append(str.charAt(0)).append(str.substring(1).toLowerCase());
                    state = false;
                }
            }
            sb.append(" ");
        }

        if(s.substring(s.length()-1).equals(" ")){
            answer = String.valueOf(sb);
        }
        else{
            answer = sb.substring(0,sb.length()-1);
        }
        return answer;
    }
}
