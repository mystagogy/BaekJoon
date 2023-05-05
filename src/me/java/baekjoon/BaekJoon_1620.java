package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BaekJoon_1620 {
    public static boolean isNum(String str){
        for(int i = 0; i < str.length(); i++){
            if(!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> smap = new HashMap<>();
        HashMap<Integer, String> imap = new HashMap<>();
        for(int i = 1; i <= N; i++){
            String str = br.readLine();
            smap.put(str, i);
            imap.put(i, str);
        }

        StringBuilder sb = new StringBuilder();
        while (M --> 0){
            String str = br.readLine();
            if(isNum(str)) sb.append(imap.get(Integer.parseInt(str))).append("\n");
            else sb.append(smap.get(str)).append("\n");
        }
        System.out.println(sb);
    }
}
