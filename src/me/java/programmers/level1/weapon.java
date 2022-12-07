package me.java.programmers.level1;

public class weapon {
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        int[] count = new int[number];
        for(int i = 0; i < count.length; i++){
            int x = i+1;
            int cnt = 0;
            for(int j = 1; j*j <= x; j++){
                if(j*j == x) cnt++;
                else if(x%j==0) cnt+=2;
                count[i] = cnt;
            }
            count[i] = cnt;
        }

        for(int i = 0 ; i < count.length; i++){
            if(count[i] > limit){
                count[i] = power;
            }
        }

        for(int result : count){
            answer+=result;
        }
        return answer;
    }
}
