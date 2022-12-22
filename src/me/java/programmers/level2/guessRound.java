package me.java.programmers.level2;

public class guessRound {
    public static int round(int x){
        if(x%2==0){
            x = x/2;
        }
        else{
            x = (x/2) +1;
        }
        return x;
    }
    public static int solution(int n, int a, int b) {
        int answer = 0;
        boolean status = true;
        if(b < a){
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (true){
            answer++;
            if(a%2 != 0 && (b-a) == 1){
                break;
            }
            else{
               a = round(a);
               b = round(b);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(8,4,7));
    }
}
