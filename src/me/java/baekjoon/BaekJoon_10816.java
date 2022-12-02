package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BaekJoon_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> hsmp = new HashMap<>();
        int tmp = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            tmp = Integer.parseInt(st.nextToken());
            if (!hsmp.isEmpty() && hsmp.containsKey(tmp)) {
                hsmp.replace(tmp, hsmp.get(tmp) + 1);
            } else {
                hsmp.put(tmp, 1);
            }
        }
        num = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            tmp = Integer.parseInt(st.nextToken());
            if (hsmp.containsKey(tmp)) {
                sb.append(hsmp.get(tmp)).append(" ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb);

    }
}
