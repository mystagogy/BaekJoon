package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BaekJoon_11000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]);
            arr[i][1] = Integer.parseInt(input[1]);
        }


        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(arr[0][1]);


        for(int i = 1; i < n; i++) {
            if(pq.peek() <= arr[i][0]) pq.poll();
            pq.add(arr[i][1]);
        }
        System.out.print(pq.size());

    }
}
