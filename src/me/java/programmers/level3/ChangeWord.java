package me.java.programmers.level3;

public class ChangeWord {
    static boolean[] visit;
    static int answer = 0;
    public void dfs(String current, String target, String[] words, int count){
        if(current.equals(target)){
            answer = count;
            return;
        }
        for(int i = 0; i < words.length; i++){

            if(visit[i]) continue;

            int k = 0;
            for(int j = 0; j < current.length(); j++){
                if(current.charAt(j) !=  words[i].charAt(j)) k++;
            }

            if(k == 1){
                visit[i] = true;
                dfs(words[i], target, words, count +1);
                visit[i] = false;
            }
        }
    }
    public int solution(String begin, String target, String[] words) {
        visit = new boolean[words.length];
        dfs(begin, target, words, 0);
        return answer;
    }
}
