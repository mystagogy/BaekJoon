package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BaekJoon_10828 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try{
            int num = Integer.parseInt(br.readLine());
            for(int i = 0; i < num; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                while(st.hasMoreTokens()){
                    String command = st.nextToken().toUpperCase();
                    if(command.equals("PUSH")){

                        int x = Integer.parseInt(st.nextToken());
                        list.add(x);
                    }
                    else if(command.equals("POP")){
                        if(list.size() != 0){
                            int index = list.size()-1;
                            System.out.println(list.get(index));
                            list.remove(index);
                        }
                        else
                            System.out.println(-1);
                    }
                    else if(command.equals("SIZE")){

                        System.out.println(list.size());

                    }
                    else if(command.equals("EMPTY")){
                        int answer = 1;
                        if(list.size() != 0)
                            answer = 0;
                        System.out.println(answer);


                    } else if (command.equals("TOP")){

                        if(list.size()!=0){
                            int index = list.size()-1;
                            System.out.println(list.get(index));
                        }
                        else
                            System.out.println(-1);

                    } else{
                        i--;
                    }
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
