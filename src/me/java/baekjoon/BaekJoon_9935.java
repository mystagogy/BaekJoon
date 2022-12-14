package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_9935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String word = br.readLine();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            sb.append(str.charAt(i));
            if(sb.length() >= word.length()){
                boolean state = true;
                for(int j = 0; j < word.length(); j++){
                    char strChar = sb.charAt(sb.length()- word.length()+j);
                    char wordChar = word.charAt(j);
                    if(strChar != wordChar){
                        state = false;
                        break;
                    }
                }
                if(state){
                    sb.delete(sb.length()-word.length(), sb.length());
                }
            }
        }
        if(sb.length()==0){
            System.out.println("FRULA");
            return;
        }
        System.out.println(sb);
    }
}
