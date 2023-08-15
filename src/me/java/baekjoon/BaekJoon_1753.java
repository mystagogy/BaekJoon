package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon_1753 {

    static class Node {
        int next, cost;
        public Node(int next, int cost) {
            this.next = next;
            this.cost = cost;
        }
    }

    static class PqFormat implements Comparable<PqFormat>{
        int index, dist;
        PqFormat(int index, int dist) {
            this.index = index;
            this.dist = dist;
        }

        @Override
        public int compareTo(PqFormat o) {
            // dist 기준 오름차순 정렬
            return this.dist - o.dist;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());

        ArrayList<Node>[] connections = new ArrayList[n + 1];
        for(int i = 1 ; i <= n ; i ++) {
            connections[i] = new ArrayList<>();
        }

        for(int i = 0 ; i < e ; i ++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            connections[x].add(new Node(y, z));
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        boolean[] visited = new boolean[n + 1];

        PriorityQueue<PqFormat> pq = new PriorityQueue<>();
        pq.add(new PqFormat(start, 0));

        while(!pq.isEmpty()) {
            PqFormat now = pq.poll();
            if(visited[now.index] == true) continue;

            visited[now.index] = true;
            for(Node node : connections[now.index]) {
                if(dist[node.next] > dist[now.index] + node.cost) {
                    dist[node.next] = dist[now.index] + node.cost;
                    pq.add(new PqFormat(node.next, dist[node.next]));
                }
            }
        }

        for(int i = 1 ; i <= n ; i ++) {
            if(dist[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
                System.out.println(dist[i]);
            }
        }
    }
}
