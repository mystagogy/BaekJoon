package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BaekJoon_20920 {
    public static class Word {
        int count;
        String word;

        Word(int count, String word) {
            this.count = count;
            this.word = word;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Word> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++) {
            String word = br.readLine();
            if(word.length()>=M) {
                map.put(word,map.getOrDefault(word, 0)+1);
            }
        }
        for(String word:map.keySet()) {
            list.add(new Word(map.get(word),word));
        }

        Collections.sort(list,(w1, w2)->{
            if(w1.count==w2.count) {
                if(w1.word.length()==w2.word.length()) {
                    return w1.word.compareTo(w2.word);
                }else {
                    return w2.word.length()-w1.word.length();
                }
            }else {
                return w2.count-w1.count;
            }
        });
        StringBuilder sb = new StringBuilder();
        for(Word word : list) sb.append(word.word).append("\n");
        System.out.println(sb);

    }
}
