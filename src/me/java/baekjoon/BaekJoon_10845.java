package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Integer> queue = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken().toLowerCase();
            if(str.equals("push")){
                queue.add(Integer.parseInt(st.nextToken()));
            }
            else if(str.equals("pop")){
                if(queue.size()==0){
                    sb.append("-1").append("\n");
                }
                else{
                    sb.append(queue.get(0)).append("\n");
                    queue.remove(0);
                }
            }
            else if(str.equals("size")){
                sb.append(queue.size()).append("\n");
            }
            else if(str.equals("empty")){
                if(queue.isEmpty()){
                    sb.append("1").append("\n");
                }
                else {
                    sb.append("0").append("\n");
                }
            }
            else if(str.equals("front")){
                if(queue.isEmpty()){
                    sb.append("-1").append("\n");
                }
                else {
                    sb.append(queue.get(0)).append("\n");
                }
            }
            else if(str.equals("back")){
                if(queue.isEmpty()){
                    sb.append("-1").append("\n");
                }
                else {
                    sb.append(queue.get(queue.size()-1)).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
