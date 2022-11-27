package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BaekJoon_11650 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            int num = Integer.parseInt(br.readLine());
            int[][] arr = new int[num][2];
            for(int i = 0; i < num; i++){
                String str = br.readLine();
                StringTokenizer st = new StringTokenizer(str);
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o1[0] == o2[0]){
                        return o1[1] - o2[1];
                    }
                    else{
                        return o1[0] - o2[0];
                    }

                }
            });
            StringBuffer sb = new StringBuffer();
            for(int[] sort : arr){
                for(int x : sort){
                    sb.append(x).append(" ");
                }
                sb.append("\n");
            }

            System.out.println(sb);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
