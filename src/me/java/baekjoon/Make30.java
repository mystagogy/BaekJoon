package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Make30 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < num.length(); i++){
            list.add(Character.getNumericValue(num.charAt(i)));
        }
        if(!list.contains(0)) {
            System.out.println(-1);
            System.exit(0);
        }
        int sum = 0;
        for(int x : list){
            sum += x;
        }
        if(sum%3==0){
            list.sort(Comparator.reverseOrder());
        }
        else{
            System.out.println(-1);
            System.exit(0);
        }
        StringBuilder sb = new StringBuilder();
        for(int x : list){
            sb.append(x);
        }
        System.out.println(sb.toString());
    }
}
