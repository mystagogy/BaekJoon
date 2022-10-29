package me.java.baekjoon.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BaekJoon_10773 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try{
            int num = Integer.parseInt(br.readLine());
            for(int i = 0; i < num; i++){
                int x = Integer.parseInt(br.readLine());
                if( x != 0){
                    list.add(x);
                }
                else{
                    if(list.size() != 0){
                        int index = list.size()-1;
                        list.remove(index);
                    }
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        int sum = 0;
        for(int num : list){
            sum += num;
        }
        System.out.println(sum);
    }
}
