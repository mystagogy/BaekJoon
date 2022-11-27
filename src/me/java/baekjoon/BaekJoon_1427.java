package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BaekJoon_1427 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{

            int num = Integer.parseInt(br.readLine());
            boolean status =true;
            List<Integer> list= new ArrayList<>();

            while (status){
                if(num > 10){
                    list.add(num%10);
                    num = num / 10;
                }
                else{
                    list.add(num);
                    status = false;
                }
            }
            list.sort(Comparator.reverseOrder());

            StringBuffer sb = new StringBuffer();
            for(int x : list){
                sb.append(x);
            }
            System.out.println(sb);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
