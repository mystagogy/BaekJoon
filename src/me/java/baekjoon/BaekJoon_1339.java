package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon_1339 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        int[] alpha = new int[26];
        for(int i = 0; i < num; i++){
            list.add(br.readLine());
        }

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(String str : list){
            for(int i = 0; i < str.length(); i++){
                hashMap.put(str.charAt(i), hashMap.getOrDefault(str.charAt(i),0)+(int)Math.pow(10,str.length()-i-1));
                alpha[str.charAt(i)-65] = hashMap.get(str.charAt(i));
            }
        }

        Arrays.sort(alpha);

        int count = 0;
        int index = 9;
        int sum = 0;
        while (count != hashMap.size()){
            sum += alpha[alpha.length-1-count] * index;
            count++;
            index--;
        }
        System.out.println(sum);
    }
}
