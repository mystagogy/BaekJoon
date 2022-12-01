package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BaekJoon_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int num = Integer.parseInt(st.nextToken());
        int string = Integer.parseInt(st.nextToken());
        List<String> strings = new ArrayList<>();
        List<String> list = new ArrayList<>();
        for(int i = 0; i < num; i++){
            list.add(br.readLine());
        }
        for(int i = 0; i < string; i++){
            strings.add(br.readLine());
        }
        int count = 0;
        for(String result : strings){
            if(list.contains(result)){
                count++;
            }
        }
        System.out.println(count);
    }
}
