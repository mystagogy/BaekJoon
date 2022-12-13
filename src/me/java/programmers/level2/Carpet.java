package me.java.programmers.level2;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        answer = new int[2];

        int total = brown+yellow;

        int x = (brown+4)/2;
        int y = 0;
        for(int i = x; i > y ;i--) {
            y = (brown + 4) / 2 - i;
            if (i * y == total) {
                answer[0] = i;
                break;
            }
        }
        answer[1] = y;
        return answer;
    }
}
