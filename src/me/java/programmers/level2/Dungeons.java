package me.java.programmers.level2;

public class Dungeons {
    static int max = 0;
    static boolean[] visited;
    public void dfs(int[][] dungeons, boolean[] visited, int k, int count){
        for(int i = 0; i < dungeons.length; i++){
            if(!visited[i]  && k >= dungeons[i][0]){
                visited[i] = true;
                dfs(dungeons, visited, k - dungeons[i][1], count + 1);
                visited[i] = false;
            }
        }

        if(max < count){
            max = count;
        }
    }
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(dungeons, visited, k, 0);

        return max;

    }
}
