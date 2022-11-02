package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BaekJoon_18258 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> queue = new LinkedList<>();
        StringBuffer sb = new StringBuffer();
        try {
            int num = Integer.parseInt(br.readLine());
            for(int i = 0; i < num; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                while(st.hasMoreTokens()){
                    String str = st.nextToken();
                    if(str.toUpperCase().equals("PUSH")){
                        queue.addLast(Integer.parseInt(st.nextToken()));
                        break;
                    }
                    if(str.toUpperCase().equals("POP")){
                        if(queue.size() == 0){
                            sb.append(-1).append("\n");
                        }
                        else{
                            sb.append(queue.getFirst()).append("\n");
                            queue.remove(0);
                        }
                        break;
                    }
                    if(str.toUpperCase().equals("SIZE")){
                        sb.append(queue.size()).append("\n");
                        break;
                    }
                    if(str.toUpperCase().equals("EMPTY")){
                        if(queue.size() != 0){
                            sb.append(0).append("\n");
                        }else
                            sb.append(1).append("\n");
                        break;
                    }
                    if(str.toUpperCase().equals("FRONT")){
                        if(queue.size() == 0){
                            sb.append(-1).append("\n");
                        }
                        else{
                            sb.append(queue.getFirst()).append("\n");
                        }
                        break;
                    }
                    if(str.toUpperCase().equals("BACK")){
                        if(queue.size() == 0){
                            sb.append(-1).append("\n");
                        }
                        else{
                            sb.append(queue.getLast()).append("\n");
                        }
                        break;
                    }
                    else
                        i--;
                }

            }
            System.out.println(sb);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
