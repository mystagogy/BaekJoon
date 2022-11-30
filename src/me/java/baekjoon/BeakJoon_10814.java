package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BeakJoon_10814 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int num = Integer.parseInt(br.readLine());
            String[][] list = new String[num][2];
            for(int i = 0; i < list.length; i++){
                String str = br.readLine();
                StringTokenizer st = new StringTokenizer(str);
                list[i][0] = st.nextToken();
                list[i][1] = st.nextToken();
            }

            Arrays.sort(list, new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    if (o1[0] == o2[0])
                        return 1;
                    else
                        return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
                }
            });
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < list.length; i++){
                sb.append(list[i][0]).append(" ").append(list[i][1]);
                sb.append("\n");
            }
            System.out.println(sb);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

