package me.java.programmers.level1;

public class cola {
    public static int solution(int a, int b, int n) {
        int answer = 0;
        int rest = 0;
        int get = 0;
        boolean state = true;
        while(state){
            rest = n%a;
            get = (n/a)*b;
            n = get+rest;
            if(n < a){
                state = false;
            }
            answer += get;

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3,1,20));
    }
}
