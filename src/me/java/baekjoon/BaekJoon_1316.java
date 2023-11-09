package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BaekJoon_1316 {
    static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int count = 0;
        Set<Character> set = new HashSet<>();
        boolean status = true;
        while (N --> 0){
            String word = br.readLine();
            set.clear();
            status = true;
            for(int i = 0; i < word.length(); i++){
                char ch = word.charAt(i);
                if(!set.contains(ch)) set.add(ch);
                else{
                    if(word.charAt(i-1) != ch) {
                        status = false;
                        continue;
                    }
                }
            }
            if(status) count++;
        }
        System.out.print(count);


    }
}
