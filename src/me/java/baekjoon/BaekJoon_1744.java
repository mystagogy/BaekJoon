package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaekJoon_1744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> minus = new ArrayList<>();
        List<Integer> plus = new ArrayList<>();

        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());
            if( x > 0) plus.add(x);
            else minus.add(x);
        }

        Collections.sort(minus);
        plus.sort(Collections.reverseOrder());
        int sum = 0;

        if(!minus.isEmpty()){
            for(int i = 0; i < minus.size()/2; i++){
                sum += minus.get(2*i) * minus.get(2*i+1);
            }
            if(minus.size()%2 != 0){
                sum += minus.get(minus.size()-1);
            }
        }

        if(!plus.isEmpty()){
            for(int i = 0; i < plus.size()/2; i++){
                int first = plus.get(2*i);
                int second = plus.get(2*i+1);
                if(first != 1 && second != 1){
                    sum += first * second;
                }
                else{
                    sum += first + second;
                }
            }
            if(plus.size()%2 != 0 ){
                sum += plus.get(plus.size()-1);
            }
        }
        System.out.println(sum);
    }
}
