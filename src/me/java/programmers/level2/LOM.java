package me.java.programmers.level2;


public class LOM {
    public static int gcd(int a, int b){
        if( a < b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        int rest = 0;
        while(true){
            rest = a%b;
            a = b;
            b = rest;
            if(rest==0) return a;
        }
    }
    public static int solution(int[] arr) {
        int answer = arr[0];
        for(int i = 1; i < arr.length; i++){
            answer = (answer*arr[i])/gcd(answer, arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,6,8,14}));
        System.out.println(solution(new int[]{1,2,3}));
    }
}
