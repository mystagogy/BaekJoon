package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BaekJoon_1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        LinkedList<Integer> deque = new LinkedList<>();

        for(int i = 1; i <= N; i++){
            deque.add(i);
        }

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[M];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for(int i = 0; i < M; i++){
            int index = deque.indexOf(arr[i]);
            int half = 0;

            if(deque.size() %2 ==0) half = deque.size()/2 -1;
            else half = deque.size() /2;

            if(index <= half){
                for(int j = 0; j < index; j++){
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    count++;
                }
            }
            else{
                for(int j = 0; j < deque.size() - index; j++){
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    count++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(count);
    }
}
