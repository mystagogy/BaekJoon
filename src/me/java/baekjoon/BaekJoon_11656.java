package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BaekJoon_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        ArrayList<String> words = new ArrayList<>();
        for(int i = 0; i < word.length(); i++){
            words.add(word.substring(i,word.length()));
        }
        Collections.sort(words);
        StringBuilder sb = new StringBuilder();
        for(String result : words){
            sb.append(result).append("\n");
        }
        System.out.println(sb.toString());
    }
}
