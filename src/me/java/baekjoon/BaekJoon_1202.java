package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Jewelry {
    int mass;
    int value;

    Jewelry(int mass, int value) {
        this.mass = mass;
        this.value = value;
    }
}
public class BaekJoon_1202 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Jewelry[] jewelries = new Jewelry[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            jewelries[i] = new Jewelry(m, v);
        }
        Arrays.sort(jewelries, new Comparator<Jewelry>() {

            @Override
            public int compare(Jewelry o1, Jewelry o2) {
                if (o1.mass == o2.mass) {
                    return o2.value - o1.value;
                }
                return o1.mass - o2.mass;
            }

        });

        int[] bags = new int[K];
        for (int i = 0; i < K; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(bags);

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        long sum = 0;
        for (int i = 0, j = 0; i < K; i++) {
            while (j < N && jewelries[j].mass <= bags[i]) {
                queue.offer(jewelries[j++].value);
            }
            if (!queue.isEmpty()) {
                sum += queue.poll();
            }
        }
        System.out.println(sum);
    }
}
