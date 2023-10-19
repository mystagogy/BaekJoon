package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1969 {
    static int N, M;
    static String[] DNA;
    static int hd;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        DNA = new String[N];

        for (int i = 0; i < N; i++) {
            DNA[i] = br.readLine();
        }

        StringBuffer buf = new StringBuffer();

        for (int i = 0; i < M; i++) {
            int[] cnt = new int[4];
            for (int j = 0; j < N; j++) {
                char ch = DNA[j].charAt(i);

                switch (ch) {
                    case 'A':
                        cnt[0]++;
                        break;
                    case 'C':
                        cnt[1]++;
                        break;
                    case 'G':
                        cnt[2]++;
                        break;
                    case 'T':
                        cnt[3]++;
                        break;
                }

            }

            int idx = 0;
            int max = 0;
            for (int k = 0; k < 4; k++) {
                if (cnt[k] > max || (cnt[k] == max && k < idx)) {
                    max = cnt[k];
                    idx = k;
                }
            }

            switch (idx) {
                case 0:
                    buf.append('A');
                    break;
                case 1:
                    buf.append('C');
                    break;
                case 2:
                    buf.append('G');
                    break;
                case 3:
                    buf.append('T');
                    break;
            }
            hd += N - max;

        }
        buf.append("\n").append(hd);
        System.out.println(buf);


    }
}
