package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class BaekJoon_7568 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> rank = new ArrayList<>();
        int num = 0;
        try {
            String str = br.readLine();
            num = Integer.parseInt(str);
            int[] arrWeight = new int[num];
            int[] arrHeight = new int[num];
            for (int i = 0; i < num; i++) {
                String info = br.readLine();
                StringTokenizer st = new StringTokenizer(info);
                arrWeight[i] = Integer.parseInt(st.nextToken());
                arrHeight[i] = Integer.parseInt(st.nextToken());
            }
            int count = 1;
            for (int i = 0; i < arrWeight.length; i++) {
                for (int j = 0; j < arrHeight.length; j++) {
                    if (arrWeight[i] < arrWeight[j] && arrHeight[i] < arrHeight[j] ) {
                        count++;
                    }
                }
                rank.add(count);
                count = 1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            for(int result : rank)
                System.out.println(result);
        }
    }
}
