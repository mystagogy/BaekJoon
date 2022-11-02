package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BaekJoon_10866 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        LinkedList<Integer> deque = new LinkedList<>();
        try{
            int num = Integer.parseInt(br.readLine());
            for(int i = 0; i < num; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                if(st.hasMoreTokens()){
                    String str = st.nextToken();
                    if(str.toLowerCase().equals("push_front")){
                        deque.addFirst(Integer.parseInt(st.nextToken()));

                    }
                    else if(str.toLowerCase().equals("push_back")){
                        deque.addLast(Integer.parseInt(st.nextToken()));

                    }
                    else if(str.toLowerCase().equals("pop_front")){
                        if(deque.size() != 0){
                            sb.append(deque.getFirst()).append("\n");
                            deque.removeFirst();
                        }
                        else{
                            sb.append(-1).append("\n");
                        }

                    }
                    else if(str.toLowerCase().equals("pop_back")){
                        if(deque.size() != 0){
                            sb.append(deque.getLast()).append("\n");
                            deque.removeLast();
                        }
                        else{
                            sb.append(-1).append("\n");
                        }

                    }
                    else if(str.toLowerCase().equals("size")){
                        sb.append(deque.size()).append("\n");

                    }
                    else if(str.toLowerCase().equals("empty")){
                        if(deque.size() != 0){
                            sb.append(0).append("\n");
                        }else
                            sb.append(1).append("\n");

                    }
                    else if(str.toLowerCase().equals("front")){
                        if(deque.size() != 0){
                            sb.append(deque.getFirst()).append("\n");
                        }
                        else{
                            sb.append(-1).append("\n");
                        }

                    }
                    else if(str.toLowerCase().equals("back")){
                        if(deque.size() != 0){
                            sb.append(deque.getLast()).append("\n");
                        }
                        else{
                            sb.append(-1).append("\n");
                        }

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
