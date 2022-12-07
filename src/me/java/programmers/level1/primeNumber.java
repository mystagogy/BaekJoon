package me.java.programmers.level1;

public class primeNumber {
    public static int solution(int n) {
        int answer = 0;
        int[] arr =new int[n+1];
        for(int i = 2 ; i <= n; i++){
            arr[i] = i;
        }
        for(int i =2; i*i <= n; i++){
            if(arr[i]==0)
                continue;
            for(int j = i*i; j <= n; j+=i){
                arr[j] = 0;
            }
        }
        for(int i = 0; i <= n; i++){
            if(arr[i] != 0){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2));
        System.out.println(solution(10));
        System.out.println(solution(5));
    }
}
